package com.cursosdedesarrollo.sesion17;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LanguageRepositoryImpl implements LanguageRepository{

    private Conexion conexion;

    public LanguageRepositoryImpl(){
        this.conexion = new Conexion();
    }

    public LanguageRepositoryImpl(Conexion conexion){
        this.conexion = conexion;
    }
    @Override
    public List<Language> findAll() {
        // Consulta SQL que quiero realizar
        String consulta = "SELECT * FROM "+TABLE +";";
        // Listado de datos a devolver
        List<Language> listado = new LinkedList<>();
        // Crear un nuevo Prepared Statement para la consulta
        try {
            PreparedStatement prest = this.conexion.getConnection().prepareStatement(consulta);
            // Ejecución de la consulta
            ResultSet rs = prest.executeQuery(consulta);
            Language language;
            while(rs.next()){
                language = new Language();
                // Recogiendo los datos de cada campo
                // recoger el campo language_id metido dentro del objeto a devolver
                language.setLanguageId(rs.getInt(1));
                // System.out.println("ID: "+ rs.getLong(1));
                // recoger el campo name
                language.setName(rs.getString(2));
                // System.out.println("Nombre: "+ rs.getString(2));
                // recoger el campo last_update
                language.setLastUpdate(rs.getString(3));
                // System.out.println("TimeStamp: "+ rs.getString(3));
                listado.add(language);
            }
        }catch (Exception e){
            System.out.println("Error en la consulta");
            System.out.println(e.getMessage());
        }

        return listado;
    }

    @Override
    public Language insert(Language language) {
        // Inserción de Datos en la BBDD
        String sql = "INSERT into "+TABLE+" ("+NAME+","+DATETIME+ ") VALUES(?,?)";
        try{
            // inicialización de la Query
            PreparedStatement prest = this.conexion.getConnection().prepareStatement(sql);
            // meter los datos dentro de la query
            prest.setString(1, language.getName());
            prest.setString(2,language.getLastUpdate());
            // ejecutar la consulta
            int count = prest.executeUpdate();
            // nos devuelve es el número de registros modificados
            System.out.println("Registros modificados: "+count);
            // Consulta del último ID añadido
            ResultSet rs = null;
            rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
            int autoIncKeyFromFunc = -1;
            if (rs.next()) {
                autoIncKeyFromFunc = rs.getInt(1);
                Integer lastID = autoIncKeyFromFunc;
                language.setLanguageId(lastID);
                System.out.println("Último ID introducido: "+ lastID);
            } else {
                // throw an exception from here
                System.out.println("no había dato de ID");
            }
        }catch (Exception e){
            System.out.println("Error al insertar");
            System.out.println(e.getMessage());
        }

        return language;
    }

    @Override
    public Language findById(Integer id) {
        String consulta = "SELECT * FROM "+TABLE +" WHERE  "+ID+"=?";
        // System.out.println(consulta);
        Language language = new Language();
        // Crear un nuevo Prepared Statement para la consulta
        try {
            PreparedStatement prest = this.conexion.getConnection().prepareStatement(consulta);
            prest.setLong(1, id);
            // System.out.println(prest.toString());
            // Ejecución de la consulta
            ResultSet rs = prest.executeQuery();
            // extracción de datos

            while(rs.next()){
                // Recogiendo los datos de cada campo
                // recoger el campo language_id metido dentro del objeto a devolver
                language.setLanguageId(rs.getInt(1));
                // System.out.println("ID: "+ rs.getLong(1));
                // recoger el campo name
                language.setName(rs.getString(2));
                // System.out.println("Nombre: "+ rs.getString(2));
                // recoger el campo last_update
                language.setLastUpdate(rs.getString(3));
                // System.out.println("TimeStamp: "+ rs.getString(3));
            }
        }catch (Exception e){
            System.out.println("fallo de readByID");
            System.out.println(e.getMessage());
        }
        return language;
    }

    @Override
    public Language updateById(Integer id, Language language) {
        String sql = "UPDATE "+TABLE+
                " SET "+
                NAME+ " = ? ," +
                DATETIME+ " = ? " +
                " WHERE "+ID+" = ?";
        try{
            PreparedStatement prest = this.conexion.getConnection().prepareStatement(sql);
            prest.setString(1,language.getName());
            prest.setString(2,language.getLastUpdate());
            prest.setLong(3,id);
            int count = prest.executeUpdate();
            if(count==1){
                // ha ido todo guay
                System.out.println("Updating Successfully!");
                language.setLanguageId(id);
            }else{
                // no ha ido todo guay
                language.setLanguageId(0);
                System.out.println("Not good!");
            }
        }catch (Exception e){
            System.out.println("Error al modificar");
            System.out.println(e.getMessage());
        }

        return language;
    }

    @Override
    public Boolean deleteById(Integer id) {
        String sql = "DELETE from "+TABLE+" WHERE "+ID+" = ?";
        Boolean returnValue  = false;
        try {
            PreparedStatement prest = this.conexion.getConnection().prepareStatement(sql);
            prest.setLong(1, id);
            int count = prest.executeUpdate();
            if (count>0){
                returnValue = true;
            }
            System.out.println("Deleting Successfully!");
        }catch (Exception e){
            System.out.println("Error al borrar");
            System.out.println(e.getMessage());
        }
        return returnValue;
    }
}
