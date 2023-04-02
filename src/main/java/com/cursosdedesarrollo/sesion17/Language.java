package com.cursosdedesarrollo.sesion17;

import lombok.Data;

@Data
public class Language {
    private Integer languageId;
    private String name;
    private String lastUpdate;

    public Language(){
        languageId = 0 ;
        name = "";
        lastUpdate = "";
    }
}
