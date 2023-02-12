package com.cursodedesarrollo.sesion05;

import com.cursosdedesarrollo.sesion05.Hija;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHija {
    @Test
    public void testConstructoraSinParametros(){
        // GIVEN
        Hija hija;
        // WHEN
        hija = new Hija();
        // THEN
        assertEquals("", hija.getTlf());
        assertEquals("", hija.getNombre());
    }
    @Test
    public void testConstructoraConParametros(){
        // GIVEN
        Hija hija;
        String nombre = "Montse";
        String tlf = "+34";
        // WHEN
        hija = new Hija(nombre, tlf);
        // THEN
        assertEquals(tlf, hija.getTlf());
        assertEquals(nombre, hija.getNombre());
    }

    @Test
    public  void testSetterYGetter(){
        // GIVEN
        Hija hija;
        String tlf = "+34";
        // WHEN
        hija = new Hija();
        hija.setTlf(tlf);
        // THEN
        assertEquals(tlf, hija.getTlf());
    }

    @Test
    public  void testToString(){
        // GIVEN
        Hija hija;
        // WHEN
        hija = new Hija();
        // THEN
        assertEquals("Hija{ nombre='', tlf=''}", hija.toString());
    }
    @Test
    public  void testToStringConDatos(){
        // GIVEN
        Hija hija;
        String nombre = "Montse";
        String tlf = "+34";
        // WHEN
        hija = new Hija(nombre, tlf);
        // THEN
        assertEquals("Hija{ nombre='Montse', tlf='+34'}", hija.toString());
    }
}
