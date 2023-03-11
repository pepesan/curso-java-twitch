package com.cursosdedesarrollo.sesion12;

import lombok.Data;

@Data
public class Animal {
    private Integer edad;

    Animal(){
        this.edad = 0;
    }

    Animal(Integer edad){
        this.edad = edad;
    }
}
