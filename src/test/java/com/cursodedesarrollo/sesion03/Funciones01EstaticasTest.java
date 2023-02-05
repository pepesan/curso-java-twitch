package com.cursodedesarrollo.sesion03;

import org.junit.jupiter.api.Test;
import static com.cursosdedesarrollo.sesion03.Funciones01Estaticas.*;
import static org.junit.jupiter.api.Assertions.*;
public class Funciones01EstaticasTest {
    @Test
    public void testSuma(){
        int res = suma(1,2);
        assertEquals(3,res);
    }
    @Test
    public void testSuma01(){
        int res = suma(255,1);
        assertEquals(256,res);
    }

    // función que prueba el método sumaValores
    @Test
    public void testSumaValores(){
        // Declarar un array
        int[] miArray = {1,2};
        // llamar a la función
        // recoger el resultado
        int res = sumaValores(miArray);
        // comprobar que el resultado es correcto
        assertEquals(3, res);
    }

    // Segundo test con nuevos datos
    @Test
    public void testSumaValores02(){
        // Declarar un array
        int[] miArray = {1,2,3};
        // llamar a la función
        // recoger el resultado
        int res = sumaValores(miArray);
        // comprobar que el resultado es correcto
        assertEquals(6, res);
    }

    // El TDD marca que debemos implentar la prueba antes que el ćodigo de la app
    // Definir una prueba que sea capaz de probar una función/método que reste dos enteros
    @Test
    public void testResta01(){
        // Invocar a la función a probar
        // Recoger el valor
        int res = resta(3,2);
        // Comprobar que el valor es correcto
        assertEquals(1,res);
    }

    @Test
    public void testMulti(){
        // GIVEN
        float f = 2.0F;
        float f2 = 3.0F;
        // WHEN
        float res = multi(f, f2);
        // THEN
        assertEquals(6.0F, res);
    }

}
