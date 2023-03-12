package com.cursosdedesarrollo.sesion13;

public class AppExcepciones {
    public static void main(String[] args) {
        Integer i = 2;
        Integer j = 0;
        Integer res = 0;
        // manera antigua (if)
        if (j.equals(0)){
            System.out.println("No podemos realizar una división por cero");
        }else {
            res = i / j;
        }
        // manera "moderna" (excepciones)
        try {
            res = i/j;
        } catch (ArithmeticException e){
            System.out.println("Excepción capturada: ArithmeticException");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Excepción capturada: Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("Final de código");
    }
}
