package com.cursosdedesarrollo.sesion18;

import java.time.LocalDate;

public class App {

    /*
        Define la clase para un Barco que tiene: su matrícula, su eslora en metros y año de fabricación.

        En un puerto se alquilan amarres para barcos de distinto tipo.

        Define una clase Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
        fecha de devolución, la posición del amarre y el barco que lo ocupará.
        (recuerda que el barco será un atributo de alquiler)

        Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
            • Número de mástiles para veleros.
            • Potencia en CV para barcos a motor.
            • Potencia en CV y número de camarotes para yates de lujo.
        Define las tres clases Velero, BarcoMotor y YateDelujo. Será herencia de Barco.
        (¿YateDeLujo es mejor que herede de Barco o de Barco a Motor?)


        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
        alquiler y devolución), por un valor diferent por cada barco (obtenido simplemente
        multiplicando por 10 los metros de eslora).

        Crea un método en Alquiler que calcule el número de días de diferencia entre las dos fechas
        Crea un método en Barco que calcule el precio por día de Alquiler del barco
        Crea un método en Alquiler que calcule el precio final del alquiler teniendo en cuenta los días y el precio por día

        En los barcos de tipo especial el precio por día de cada barco se calcula sacando el precio normal de un barco y
        sumándole el atributo particular de cada barco.
        En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV
        y en los yates se suma la potencia en CV y el número de camarotes.

        "Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
        métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
        precio final de su alquiler"

        Crea un programa App java para probar todas estas clases con sus respectivos cálculos
     */
    public static void main(String[] args) {
        System.out.println("Prácticas");
        Alquiler alquiler = new Alquiler();
        System.out.println(alquiler);
        Barco barco = new Barco();
        System.out.println(barco);
        barco = new Barco("aadsa", 3.2F, 2015);
        System.out.println(barco);
        Velero velero = new Velero("aadsa", 3.2F, 2015, 4);
        System.out.println(velero);
        velero = new Velero();
        System.out.println(velero);
        BarcoMotor barcoMotor = new BarcoMotor();
        System.out.println(barcoMotor);
        barcoMotor = new BarcoMotor("aadsa", 3.2F, 2015, 3000.0F);
        System.out.println(barcoMotor);
        YateDeLujo yateDeLujo = new YateDeLujo();
        System.out.println(yateDeLujo);
        yateDeLujo = new YateDeLujo("aadsa", 3.2F, 2015, 3000.0F, 5);
        System.out.println(yateDeLujo);

        // calcular el precio de un barco 1 día
        barco = new Barco("aadsa", 3.2F, 2015);
        // String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco
        alquiler = new Alquiler(
                "Alquiler1",
                "dnipersona",
                LocalDate.of(2023, 1, 1), // fechaAlquier
                LocalDate.of(2023, 1, 2), // fechaDevolucion
                1, // posicionAmarre
                barco
                );

        Long dias = alquiler.calcularDiferenciaEnDias();
        System.out.println(dias);
        Float precioAlquiler = alquiler.calcularAlquiler();
        System.out.println("Eslora: " +alquiler.getBarco().getEslora());
        System.out.println(precioAlquiler);

        // precio de alquier velero 1 día
        velero = new Velero("aadsa", 3.2F, 2015, 4);
        alquiler = new Alquiler(
                "Alquiler1",
                "dnipersona",
                LocalDate.of(2023, 1, 1), // fechaAlquier
                LocalDate.of(2023, 1, 2), // fechaDevolucion
                1, // posicionAmarre
                velero
        );
        precioAlquiler = alquiler.calcularAlquiler();
        System.out.println(precioAlquiler);

        // precio de alquier BarcoMotor 1 día
        barcoMotor = new BarcoMotor("aadsa", 3.2F, 2015, 3000.0F);
        alquiler = new Alquiler(
                "Alquiler1",
                "dnipersona",
                LocalDate.of(2023, 1, 1), // fechaAlquier
                LocalDate.of(2023, 1, 2), // fechaDevolucion
                1, // posicionAmarre
                barcoMotor
        );
        precioAlquiler = alquiler.calcularAlquiler();
        System.out.println(precioAlquiler);
        // Precio de Ya te de lujo por un día
        yateDeLujo = new YateDeLujo("aadsa", 3.2F, 2015, 3000.0F, 5);
        alquiler = new Alquiler(
                "Alquiler1",
                "dnipersona",
                LocalDate.of(2023, 1, 1), // fechaAlquier
                LocalDate.of(2023, 1, 2), // fechaDevolucion
                1, // posicionAmarre
                yateDeLujo
        );
        precioAlquiler = alquiler.calcularAlquiler();
        System.out.println(precioAlquiler);
    }
}
