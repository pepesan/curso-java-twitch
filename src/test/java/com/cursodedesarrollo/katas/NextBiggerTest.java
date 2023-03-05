package com.cursodedesarrollo.katas;

import org.junit.jupiter.api.Test;

import static com.cursosdedesarrollo.katas.Kata01.nextBigger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextBiggerTest {

    @Test
    public void testNumbers(){
        assertEquals(21, nextBigger(12));
        assertEquals(531, nextBigger(513));
        assertEquals(2071, nextBigger(2017));
        assertEquals(441, nextBigger(414));
        assertEquals(414, nextBigger(144));
        // assertEquals(19009, nextBigger(10990));
    }
}
