package com.cursosdedesarrollo.sesion01;

public class ObjetosSencillos {
    public static void main(String[] args) {
        // Ejemplos de Objetos sencillos en Java
        // Objetos booleanos
        // Declaración del objeto
        Boolean activo;
        // Inicialización del objeto
        activo = true;
        // Imprimimos el objeto por pantalla
        System.out.println(activo);
        // cambiamos el valor del objeto
        activo = false;
        // Imprimimos el objeto por pantalla
        System.out.println(activo);

        // Cadena de caracteres
        // Declarando e inicializando un objeto de tipo String
        String cadena = "Hola Chat";
        System.out.println(cadena);
        // Declarando e inicialización de objeto en base a un función constructora String
        String nuevaCadena = new String("Nuevo Valor");
        System.out.println(nuevaCadena);
        // Asignamos otro valor a la referencia del objeto, crea un objeto nuevo
        nuevaCadena = "Otro Valor";
        // Después de la linea anterior el primero objeto que asignamos con "Nuevo Valor" se ha "perdido"
        // El Recolector de basura liberará eventualmente la memoria ocupada por ese objeto "perdido"
        System.out.println(nuevaCadena);
        // Acceder a propiedades el objeto
        // número de caracteres en la cadena
        System.out.println(nuevaCadena.length());
        // Objetos para números
        // Números enteros
        Integer numeroEntero = 12;
        System.out.println(numeroEntero);
        // Números de coma flotante
        Float flotante = 12.3F;
        System.out.println(flotante);
        Double doble = 12.3456789;
        System.out.println(doble);
    }
}
