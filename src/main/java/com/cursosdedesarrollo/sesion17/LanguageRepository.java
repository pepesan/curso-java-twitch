package com.cursosdedesarrollo.sesion17;

import java.util.List;

public interface LanguageRepository {
    public final static String TABLE="language";
    // campo nombre
    public final static String NAME="name";
    // campo que almacena la fecha
    public final static String DATETIME="last_update";
    // campo del identificativo
    public final static String ID="language_id";

    // método que devuelve el listado de objetos
    public List<Language> findAll();
    // método que inserta un objeto en el listado
    public Language insert(Language language);
    // método que devuelve un objeto en base a su ID
    public Language findById(Integer id);
    // método que modifica un objeto en base a su ID
    public Language updateById(Integer id, Language language);
    // método que borra un objeto en base a su ID
    public Boolean deleteById(Integer id);
}
