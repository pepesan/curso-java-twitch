package com.cursodedesarrollo.sesion06;

import com.cursosdedesarrollo.sesion06.Persona;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersona {

    @Test
    public void testConstructoraSinParametros(){
        // GIVEN
        Persona persona;
        // WHEN
        persona = new Persona();
        // THEN
        assertEquals("", persona.getNombre());
    }

    @Test
    public void testConstructoraConParametros(){
        // GIVEN
        Persona persona;
        String nombre = "David";
        // WHEN
        persona = new Persona(nombre);
        // THEN
        assertEquals(nombre, persona.getNombre());
    }

    @Test
    public void testSetterYGetter(){
        // GIVEN
        Persona persona;
        String nombre = "David";
        // WHEN
        persona = new Persona();
        persona.setNombre(nombre);
        // THEN
        assertEquals(nombre, persona.getNombre());
    }

    @Test
    public void testToString(){
        // GIVEN
        Persona persona;
        // WHEN
        persona = new Persona();
        // THEN
        assertEquals("Persona{nombre=''}", persona.toString());
    }
}
