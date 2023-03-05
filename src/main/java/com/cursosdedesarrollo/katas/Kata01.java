package com.cursosdedesarrollo.katas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Kata01 {

    public static Integer cambiaANumero(List<Integer> entrada){
        StringBuffer salida = new StringBuffer();
        for (Integer i : entrada) {
            salida.append(i);
        }
        System.out.println(salida);
        return Integer.parseInt(salida.toString());
    }

    public static Integer nextBigger(Integer input){
        String cadena = input.toString();
        List<Integer> listado = new LinkedList<>();
        for (int i = 0; i< cadena.length(); i++ ){
            listado.add(Integer.parseInt(cadena.substring(i,i+1)));
        }
        System.out.println("Listado generado: " + listado);
        // Cálculo de numero
        for (int i = listado.size()-1; i>0; i--){
            System.out.println("i: "+ i);
            if (listado.get(i-1) < listado.get(i) ){
                Integer temp = listado.get(i);
                System.out.println("temp: "+ temp);
                listado.set(i, listado.get(i-1));
                listado.set(i-1,temp);
                Integer posibleSalida = cambiaANumero(listado);
                if (posibleSalida> input){
                    return posibleSalida;
                }
            }
        }

        return input;
    }
    public static void main(String[] args) {
        // ref: https://www.codewars.com/kata/55983863da40caa2c900004e
        // Create a function that takes a positive integer
        // and returns the next bigger number that can be formed
        // by rearranging its digits.
        Integer i = nextBigger(12);
        System.out.println(i);



    }
}
