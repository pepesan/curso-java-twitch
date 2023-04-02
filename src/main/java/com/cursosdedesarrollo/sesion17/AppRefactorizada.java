package com.cursosdedesarrollo.sesion17;

import java.util.List;

public class AppRefactorizada {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        // En base a config
        // podríamos inicializar una implementación u otra
        LanguageRepository languageRepository = new LanguageRepositoryImpl(conexion);
        // uso de interfaz con los métodos comunes
        List<Language> listado = languageRepository.findAll();
        System.out.println(listado);
        Language language = new Language();
        language.setName("lufegaba");
        language.setLastUpdate("2023-04-02 18:25:00");
        languageRepository.insert(language);
        language = languageRepository.findById(language.getLanguageId());
        System.out.println(language);
        language.setName("MkVerdu");
        language.setLastUpdate("2023-04-02 18:35:00");
        language = languageRepository.updateById(language.getLanguageId(), language);
        System.out.println(language);
        language = languageRepository.findById(language.getLanguageId());
        System.out.println(language);
        Boolean ret = languageRepository.deleteById(language.getLanguageId());
        System.out.println(ret);
        language = languageRepository.findById(language.getLanguageId());
        System.out.println(language);
    }
}
