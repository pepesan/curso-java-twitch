package com.cursodedesarrollo.sesion17;

import com.cursosdedesarrollo.sesion17.Language;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LanguageTest {

    @Test
    public void  testContructora(){
        // GIVEN
        // Dado que tengo un objeto de la clase
        Language language;
        // WHEN
        // cuando ejecuto la función constructora sin parámetros
        language = new Language();
        // THEN
        // comprobamos que los datos iniciales son los correctos
        // comprobamos el id
        assertEquals(0, language.getLanguageId());
        // comprobamos el name
        assertEquals("", language.getName());
        // comprobamos el lastUpdate
        assertEquals("", language.getLastUpdate());

    }

}
