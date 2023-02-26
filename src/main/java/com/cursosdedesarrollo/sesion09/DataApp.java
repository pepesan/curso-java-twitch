package com.cursosdedesarrollo.sesion09;

public class DataApp {
    public static void main(String[] args) {
        // clase sin Lombok
        DatoSimple datoSimple = new DatoSimple();
        datoSimple.setName("David");
        datoSimple.setAge(44);
        System.out.println(datoSimple);

        // clase con lombok
        DatoLombok datoLombok = new DatoLombok();
        datoLombok.setName("David");
        datoLombok.setAge(44);
        System.out.println(datoLombok.getName());
        System.out.println(datoLombok.getAge());
        System.out.println(datoLombok);
        DatoLombok datoLombok2 = new DatoLombok("David", 44);
        if (datoLombok.equals(datoLombok2)){
            System.out.println("Los dos objetos son iguales");
        }else {
            System.out.println("Los dos objetos son distintos");
        }
    }
}
