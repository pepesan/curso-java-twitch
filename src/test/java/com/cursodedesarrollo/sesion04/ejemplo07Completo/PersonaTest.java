package com.cursodedesarrollo.sesion04.ejemplo07Completo;

import com.cursosdedesarrollo.sesion04.ejemplo07Completo.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {
    @Test
    public void testConstructoraSinParametros(){
        // GIVEN Declaro un objeto de la clase Persona
        Persona persona;
        // When Ejecuto la función constrtuctora de la clase Persona
        persona = new Persona();
        // Then Comprobamos que los datos iniciales son correctos dentro del objeto
        assertEquals("", persona.getNombre());
        assertEquals("", persona.getTlf());
        assertEquals("", persona.getDireccion());
        assertEquals(0, persona.getEdad());
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
        assertEquals(nombre, persona.getNombre());
        assertEquals(tlf, persona.getTlf());
        assertEquals(direccion, persona.getDireccion());
        assertEquals(edad, persona.getEdad());
    }
    @Test
    public void testToString(){
        // Given
        Persona persona;
        String nombre = "David";
        String tlf = "+34 656778899";
        String direccion = "C/ Mayor, Salamanca";
        Integer edad = 44;
        // When
        persona = new Persona(nombre, tlf, direccion, edad);
        // Then
        // Valor que se supone que debe devolver el toString()
        String valorEsperado = "Persona{nombre='David', tlf='+34 656778899', direccion='C/ Mayor, Salamanca', edad=44}";
        // Comprobación del valor devuelto
        assertEquals(valorEsperado, persona.toString());
    }

    @Test
    public void testGetterYSetterNombre(){
        Persona persona = new Persona();
        assertEquals("", persona.getNombre());
        persona.setNombre("David");
        assertEquals("David", persona.getNombre());
    }
    @Test
    public void testGetterYSetterTlf(){
        Persona persona = new Persona();
        assertEquals("", persona.getTlf());
        persona.setTlf("+34");
        assertEquals("+34", persona.getTlf());
    }
    @Test
    public void testGetterYSetterDireccion(){
        Persona persona = new Persona();
        assertEquals("", persona.getDireccion());
        persona.setDireccion("Salamanca");
        assertEquals("Salamanca", persona.getDireccion());
    }
    @Test
    public void testGetterYSetterEdad(){
        Persona persona = new Persona();
        assertEquals(0, persona.getEdad());
        persona.setEdad(44);
        assertEquals(44, persona.getEdad());
    }

    @Test
    public void testEquals(){
        // Given
        String nombre = "David";
        String tlf = "+34";
        String direccion = "Salamanca";
        Integer edad = 44;
        // When
        // inicializar el primer objeto
        Persona persona = new Persona(nombre, tlf, direccion, edad);
        Persona persona2 = new Persona(nombre, tlf, direccion, edad);
        // Then
        // comprobamos que ambos objeto son iguales
        assertTrue(persona.equals(persona2));
    }
}
