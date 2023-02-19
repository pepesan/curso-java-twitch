package com.cursodedesarrollo.sesion05;

import com.cursosdedesarrollo.sesion05.Madre;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MadreTest {
    @Test
    public void testConstructoraSinParametros(){
        // GIVEN
        Madre madre;
        // WHEN
        madre = new Madre();
        // THEN
        assertEquals("", madre.getNombre());
    }

    @Test
    public void testConstructoraConParametros(){
        // GIVEN
        Madre madre;
        String nombre = "Montse";
        // WHEN
        madre = new Madre(nombre);
        // THEN
        assertEquals(nombre, madre.getNombre());
    }

    @Test
    public  void testSetterYGetter(){
        // GIVEN
        Madre madre;
        String nombre = "Montse";
        // WHEN
        madre = new Madre();
        madre.setNombre(nombre);
        // THEN
        assertEquals(nombre, madre.getNombre());
    }

    @Test
    public  void testToString(){
        // GIVEN
        Madre madre;
        String nombre = "Montse";
        // WHEN
        madre = new Madre(nombre);
        // THEN
        assertEquals("Madre{nombre='Montse'}", madre.toString());
    }

}
