package com.cursosdedesarrollo.sesion14;

import java.io.*;

public class FicherosApp {
    public static void main(String[] args){
        System.out.println("Ejemplos de ficheros");
        File file = null;
        try {
            file = new File("./md5sum.txt");
            if (file.createNewFile()) {
                System.out.println("Success!");
            } else {
                System.out.println
                        ("Error, file already exists.");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println(ioe.getMessage());
        }
        BufferedWriter out = null;
        try {
            FileWriter fileWriter = new FileWriter("./md5sum.txt");
            out = new BufferedWriter(fileWriter);
            out.write("aString");
            out.close();
            System.out.println
                    ("File created successfully");
        } catch (IOException e) {
            System.out.println("Fallo al escribir el fichero");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ejecutado en ambos casos try completo o catch");
        }
        FileReader fr = null;
        BufferedReader br;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            file = new File("./md5sum.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
