package com.cursodedesarrollo.katas;

import com.cursosdedesarrollo.katas.RomanNumerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void testToRoman() throws Exception {
        assertEquals("I", RomanNumerals.toRoman(1));
        assertEquals("II", RomanNumerals.toRoman(2));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertEquals(1, RomanNumerals.fromRoman("I"));
        assertEquals(2, RomanNumerals.fromRoman("II"));
        assertEquals(10, RomanNumerals.fromRoman("X"));
        assertEquals(4, RomanNumerals.fromRoman("IV"));
        assertEquals(7, RomanNumerals.fromRoman("VII"));
        assertEquals(8, RomanNumerals.fromRoman("VIII"));
        assertEquals(6, RomanNumerals.fromRoman("VI"));
        assertEquals(9, RomanNumerals.fromRoman("IX"));
    }
    @Test
    public void testFromRoman2() throws Exception {



    }
}
