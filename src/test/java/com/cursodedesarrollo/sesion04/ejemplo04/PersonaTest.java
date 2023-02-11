package com.cursodedesarrollo.sesion04.ejemplo04;

import com.cursosdedesarrollo.sesion04.ejemplo04.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {
    @Test
    public void testConstructoraSinParametros(){
        // GIVEN Declaro un objeto de la clase Persona
        Persona persona;
        // When Ejecuto la función constrtuctora de la clase Persona
        persona = new Persona();
        // Then Comprobamos que los datos iniciales son correctos dentro del objeto
        assertEquals("", persona.nombre);
        assertEquals("", persona.tlf);
        assertEquals("", persona.direccion);
        assertEquals(0, persona.edad);
    }
    // Prueba que compruebe la función constructora con parámetros
    @Test
    public void testConstructoraConParametros(){
        // Given
        Persona persona;
        String nombre = "David";
        String tlf = "+34 656778899";
        String direccion = "C/ Mayor, Salamanca";
        Integer edad = 44;
        // When
        persona = new Persona(nombre, tlf, direccion, edad);
        // Then
        assertEquals(nombre, persona.nombre);
        assertEquals(tlf, persona.tlf);
        assertEquals(direccion, persona.direccion);
        assertEquals(edad, persona.edad);
    }
}
