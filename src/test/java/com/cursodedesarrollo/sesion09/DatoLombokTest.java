package com.cursodedesarrollo.sesion09;

import com.cursosdedesarrollo.sesion09.DatoLombok;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatoLombokTest {
    @Test
    public void testConstructorConParametros(){
        // GIVEN
        DatoLombok datoLombok;
        String name = "David";
        Integer age = 44;
        // WHEN
        datoLombok = new DatoLombok(name, age);
        // THEN
        assertEquals(name, datoLombok.getName());
        assertEquals(age, datoLombok.getAge());
    }
    @Test
    public void testSetterYGetter(){
        // GIVEN
        DatoLombok datoLombok;
        String name = "David";
        Integer age = 44;
        // WHEN
        datoLombok = new DatoLombok();
        datoLombok.setName(name);
        datoLombok.setAge(age);
        // THEN
        assertEquals(name, datoLombok.getName());
        assertEquals(age, datoLombok.getAge());
    }
}
