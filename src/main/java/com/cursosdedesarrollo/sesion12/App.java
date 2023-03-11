package com.cursosdedesarrollo.sesion12;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // inicialización normal
        ImprimeInteger imprimeInteger = new ImprimeInteger(1);
        ImprimeDouble imprimeDouble = new ImprimeDouble(2.0D);
        // inicialización con <Tipo>
        Imprime<String> imprime = new Imprime<>("Dato");
        // similar a la inialización de un Listado
        List<String> listado = new ArrayList<>();
        // uso de clase generica
        imprime.imprime();

        // inicializar con otro tipo de dato
        Imprime<Integer> imprime1 = new Imprime<>(1);
        //  uso del objeto
        imprime1.imprime();

        ImprimeAnimal<Animal> imprimeAnimal = new ImprimeAnimal<>(new Animal());
        imprimeAnimal.imprime();

        ImprimeAnimal<Gato> imprimegato = new ImprimeAnimal<>(new Gato(12,"Minu"));
        imprimegato.imprime();
    }
}
