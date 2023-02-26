package com.cursodedesarrollo.sesion09;

import com.cursosdedesarrollo.sesion09.DatoSimple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatoSimpleTest {
    @Test
    public void testConstructoraSinParametros(){
        // GIVEN
        DatoSimple datoSimple;
        // WHEN
        datoSimple = new DatoSimple();
        // THEN
        assertEquals("", datoSimple.getName());
        assertEquals(0, datoSimple.getAge());
    }
    @Test
    public void testConstructoraConParametros(){
        // GIVEN
        DatoSimple datoSimple;
        String name = "David";
        Integer age = 44;
        // WHEN
        datoSimple = new DatoSimple(name, age);
        // THEN
        assertEquals(name, datoSimple.getName());
        assertEquals(age, datoSimple.getAge());
    }
    @Test
    public void testGettersYSetters(){
        // GIVEN
        DatoSimple datoSimple;
        String name = "David";
        Integer age = 44;
        // WHEN
        datoSimple = new DatoSimple();
        datoSimple.setName(name);
        datoSimple.setAge(age);
        // THEN
        assertEquals(name, datoSimple.getName());
        assertEquals(age, datoSimple.getAge());
    }
    @Test
    public void testToString(){
        // GIVEN
        DatoSimple datoSimple;
        String name = "David";
        Integer age = 44;
        // WHEN
        datoSimple = new DatoSimple(name, age);
        // THEN
        assertEquals("DatoSimple{name='David', age=44}",datoSimple.toString());
    }
    @Test
    public void testEquals(){
        // GIVEN
        DatoSimple datoSimple1 = new DatoSimple("David", 44);
        DatoSimple datoSimple2 = new DatoSimple("David", 44);
        // WHEN
        Boolean salidaEquals = datoSimple1.equals(datoSimple2);
        // THEN
        assertTrue(salidaEquals);

    }
}

