package com.cursosdedesarrollo.sesion16;

import java.sql.*;

public class App {
    public final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";
    public final static String URL = "jdbc:mysql://localhost:3306/test";

    // nombre de la tabla
    private final static String TABLE="language";
    // campo nombre
    private final static String NAME="name";
    // campo que almacena la fecha
    private final static String DATETIME="last_update";
    // campo del identificativo
    private final static String ID="language_id";
    private static int LAST_INSERT_ID ;


    public static void consultaById(Connection connection){
        // Consulta de dato individual
        System.out.println("ReadByID");
        System.out.println(LAST_INSERT_ID);
        // consulta = "SELECT * FROM "+TABLE +" WHERE "+ID+" =  "+LAST_INSERT_ID;

        String consulta = "SELECT * FROM "+TABLE +" WHERE  "+ID+"=?";
        System.out.println(consulta);
        // Crear un nuevo Prepared Statement para la consulta
        try {
            PreparedStatement prest = connection.prepareStatement(consulta);
            prest.setLong(1, 2);
            System.out.println(prest.toString());
            System.out.println("después del setlong");
            // Ejecución de la consulta
            ResultSet rs = prest.executeQuery();
            ResultSetMetaData rmeta = rs.getMetaData();
            int numColumns=rmeta.getColumnCount();
            for(int i=1;i<=numColumns;++i) {
                if(i<numColumns)
                    System.out.print(rmeta.getColumnName(i)+" | ");
                else
                    System.out.println(rmeta.getColumnName(i));
            }
            // extracción de datos
            while(rs.next()){
                for(int i=1;i<=numColumns;++i) {
                    if(i<numColumns)
                        System.out.print(rs.getString(i)+" | ");
                    else
                        System.out.println(rs.getString(i));
                }
            }
        }catch (Exception e){
            System.out.println("fallo de readByID");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Connection connection = null;
        try {
            // Carga del Driver de la BBDD
            Class.forName (DRIVER_NAME)
                    .newInstance ();
            // Apertura de la Conexión a BBDD
            connection = DriverManager
                    .getConnection (URL, USERNAME, PASSWORD);
            System.out.println(connection);
            System.out.println("Aplicación Conectada Correctamente");

            // Inserción de Datos en la BBDD
            String sql = "INSERT into "+TABLE+" ("+NAME+","+DATETIME+ ") VALUES(?,?)";
            // inicialización de la Query
            PreparedStatement prest = connection.prepareStatement(sql);
            // meter los datos dentro de la query
            prest.setString(1, "España");
            prest.setString(2,"2023-03-26 18:00:00" );
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
                LAST_INSERT_ID = autoIncKeyFromFunc;
                System.out.println("Último ID introducido: "+ LAST_INSERT_ID);
            } else {
                // throw an exception from here
                System.out.println("no había dato de ID");
            }
            // Consultas de datos en la BBDD
            // Consulta SQL que quiero realizar
            String consulta = "SELECT * FROM "+TABLE +";";
            // Crear un nuevo Prepared Statement para la consulta
            prest = connection.prepareStatement(consulta);
            // Ejecución de la consulta
            rs = prest.executeQuery(consulta);
            while(rs.next()){
                // Recogiendo los datos de cada campo
                // recoger el campo language_id
                System.out.println("ID: "+ rs.getLong(1));
                // recoger el campo name
                System.out.println("Nombre: "+ rs.getString(2));
                // recoger el campo last_update
                System.out.println("TimeStamp: "+ rs.getString(3));
            }
            // Extracción de metadatos y datos de la tabla
            System.out.println("Select");
            consulta = "SELECT * FROM "+TABLE +";";
            // Crear un nuevo Prepared Statement para la consulta
            prest = connection.prepareStatement(consulta);
            // Ejecución de la consulta
            rs = prest.executeQuery(consulta);
            // intentar recoger los metadatos de la tabla
            ResultSetMetaData rmeta = rs.getMetaData();
            int numColumns=rmeta.getColumnCount();
            for(int i=1;i<=numColumns;++i) {
                if(i<numColumns)
                    System.out.print(rmeta.getColumnName(i)+" | ");
                else
                    System.out.println(rmeta.getColumnName(i));
            }
            // extracción de datos
            while(rs.next()){
                for(int i=1;i<=numColumns;++i) {
                    if(i<numColumns)
                        System.out.print(rs.getString(i)+" | ");
                    else
                        System.out.println(rs.getString(i));
                }
            }
            // Consulta de dato individual
            System.out.println("ReadByID");
            System.out.println(LAST_INSERT_ID);
            //consulta = "SELECT * FROM "+TABLE +" WHERE "+ID+" =  "+LAST_INSERT_ID;
            System.out.println(consulta);
            consulta = "SELECT * FROM "+TABLE +" WHERE "+ID+" = ? ";
            // Crear un nuevo Prepared Statement para la consulta
            try {
                PreparedStatement prest2 = connection.prepareStatement(consulta);
                prest2.setInt(1,LAST_INSERT_ID);
                // Ejecución de la consulta
                rs = prest2.executeQuery();
                rmeta = rs.getMetaData();
                numColumns=rmeta.getColumnCount();
                for(int i=1;i<=numColumns;++i) {
                    if(i<numColumns)
                        System.out.print(rmeta.getColumnName(i)+" | ");
                    else
                        System.out.println(rmeta.getColumnName(i));
                }
                // extracción de datos
                while(rs.next()){
                    for(int i=1;i<=numColumns;++i) {
                        if(i<numColumns)
                            System.out.print(rs.getString(i)+" | ");
                        else
                            System.out.println(rs.getString(i));
                    }
                }
            }catch (Exception e){
                System.out.println("fallo de readByID");
                System.out.println(e.getMessage());
            }
            // intentar recoger los metadatos de la tabla


            // Actualización de dato Individual
            System.out.println("UpdateByID");
            sql = "UPDATE "+TABLE+" SET "+NAME+
                    " = ? WHERE "+ID+" = ?";
                prest = connection.prepareStatement(sql);
                prest.setString(1,"ESHpaña");
                prest.setLong(2,LAST_INSERT_ID);
                count = prest.executeUpdate();
                if(count==1){
                    // ha ido todo guay
                    System.out.println("Updating Successfully!");
                }else{
                    // no ha ido todo guay
                    System.out.println("Not good!");
                }
            // leer el dato modificado
            System.out.println("ReadByID");
            //consulta = "SELECT * FROM "+TABLE +" WHERE '"+ID+"' =  "+ LAST_INSERT_ID;
            System.out.println("Sql read: " + consulta);
            consulta = "SELECT * FROM "+TABLE +" WHERE '"+ID+"' =  ?";
            // Crear un nuevo Prepared Statement para la consulta
            PreparedStatement prest2 = connection.prepareStatement(consulta);
            prest2.setInt(1,LAST_INSERT_ID);
            // Ejecución de la consulta
            rs = prest2.executeQuery();
            // intentar recoger los metadatos de la tabla
            rmeta = rs.getMetaData();
            numColumns=rmeta.getColumnCount();
            for(int i=1;i<=numColumns;++i) {
                if(i<numColumns)
                    System.out.print(rmeta.getColumnName(i)+" | ");
                else
                    System.out.println(rmeta.getColumnName(i));
            }
            // extracción de datos
            while(rs.next()){
                for(int i=1;i<=numColumns;++i) {
                    if(i<numColumns)
                        System.out.print(rs.getString(i)+" | ");
                    else
                        System.out.println(rs.getString(i));
                }
            }

            // Borrado de dato individual
            System.out.println("DeleteByID");
            sql = "DELETE from "+TABLE+" WHERE "+ID+" = ?";
            prest = connection.prepareStatement(sql);
            prest.setLong(1,LAST_INSERT_ID);
            prest.executeUpdate();
            System.out.println("Deleting Successfully!");

            consultaById(connection);

        }
        catch (Exception e){
            System.out.println("Fallo al conectar");
            System.out.println(e.getMessage());
        }finally {
            try {
                if (connection!=null){
                    // Cerrar la conexión
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println("No se puede cerrar la conexión");
            }

        }

    }
}
