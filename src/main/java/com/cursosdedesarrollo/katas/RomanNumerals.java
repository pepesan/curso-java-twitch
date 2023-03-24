package com.cursosdedesarrollo.katas;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    // Input range : 1 <= n < 4000
    public static String toRoman(Integer num) {
        if (num <= 0 || num >= 4000) {
            throw new IllegalArgumentException("Invalid input number. Please enter a number between 1 and 3999.");
        }
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < romanValues.length; i++) {
            while (num >= romanValues[i]) {
                result.append(romanNumerals[i]);
                num -= romanValues[i];
            }
        }
        return result.toString();
    }




    public static int fromRoman(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanCharToInt(currentChar);
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + c);
        }
    }
}

