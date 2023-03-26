package com.cursosdedesarrollo.sesion15;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";
    public final static String URL = "jdbc:mysql://localhost:3306/test";

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            // Carga del Driver de la BBDD
            Class.forName (DRIVER_NAME)
                    .newInstance ();
            // Apertura de la Conexión a BBDD
            Connection connection = DriverManager
                    .getConnection (URL, USERNAME, PASSWORD);
            System.out.println(connection);
            System.out.println("Aplicación Conectada Correctamente");
            // Cerrar la conexión
            connection.close();
        }catch (Exception e){
            System.out.println("Fallo al conectar");
            System.out.println(e.getMessage());
        }

    }
}
