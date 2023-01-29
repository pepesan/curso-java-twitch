package com.cursosdedesarrollo.sesion01;

public class Operadores {
    public static void main(String[] args) {
        // Declarar varias variables en un misma línea
        int i = 1,j = 2;
        System.out.println(i);
        System.out.println(j);
        // suma
        int resultado = i + j;
        System.out.println(resultado);
        // resta
        resultado = j -i ;
        System.out.println(resultado);
        // multiplicación
        resultado = i * j;
        System.out.println(resultado);
        // división
        resultado = j / i;
        System.out.println(resultado);
        // división a float
        i = 3;
        j = 4;

        // División no Entera
        // Hay que hacer un Casting antes de la asignación del resultado
        float resultadoFlotante = (float)i/ (float)j;
        System.out.println(resultadoFlotante);

        // Operación resto
        // división entera normal
        i =14;
        j= 5;
        // int resultado
        resultado = i/j;
        System.out.println(resultado);
        // Resto de la división
        i = 14;
        j = 5;
        resultado = i % j;
        System.out.println(resultado);

        // Operadores de comparación
        // Es mejor darlos con las sentencias condicionales

        // incrementos se usan mucho en bucles
        i = 1;
        // preincremento
        ++i;
        System.out.println(i);
        // postincremento
        i++;
        System.out.println(i);
        // predecremento
        --i;
        System.out.println(i);
        // post decremento
        i--;
        System.out.println(i);

        // Operadores de asignación con operación incluida (Apócopes)
        i = 1;
        // incremento de una variable en un número
        i = i + 2;
        System.out.println(i);
        // manera reducida o apócope
        i+=2;
        System.out.println(i);
        // resta
        i-=2;
        System.out.println(i);
        // multiplicación
        i*=2;
        System.out.println(i);

        // Usos cadenas de caracteres (Strings)
        String cadena1 = "Hola";
        String cadena2 = " chat!";
        // concatenación de cadenas de caracteres
        String cadenaResultado = cadena1 + cadena2;
        System.out.println(cadenaResultado);

        cadenaResultado = cadena1 + i ;
        System.out.println(cadenaResultado);
    }
}
