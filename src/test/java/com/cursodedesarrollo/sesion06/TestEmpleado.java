package com.cursodedesarrollo.sesion06;

import com.cursosdedesarrollo.sesion06.Empleado;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmpleado {

    @Test
    public void testConstructoraSinParametros(){
        // GIVEN
        Empleado empleado;
        // WHEN
        empleado = new Empleado();
        // THEN
        assertEquals("", empleado.getNombre());
        assertEquals(0.0, empleado.getSueldo());
    }

    @Test
    public void testConstructoraConParametros(){
        // GIVEN
        Empleado empleado;
        String nombre = "David";
        Double sueldo = 0.0;
        // WHEN
        empleado = new Empleado(nombre, sueldo);
        // THEN
        assertEquals(nombre, empleado.getNombre());
        assertEquals(sueldo, empleado.getSueldo());
    }

    @Test
    public void testSetterYGetter(){
        // GIVEN
        Empleado empleado;
        String nombre = "David";
        Double sueldo = 0.0;
        // WHEN
        empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setSueldo(sueldo);
        // THEN
        assertEquals(nombre, empleado.getNombre());
        assertEquals(sueldo, empleado.getSueldo());
    }

    @Test
    public void testToString(){
        // GIVEN
        Empleado empleado;
        // WHEN
        empleado = new Empleado();
        String resultado = empleado.toString();
        // THEN
        assertEquals("Empleado{nombre=,sueldo=0.0}", resultado);
    }
}
