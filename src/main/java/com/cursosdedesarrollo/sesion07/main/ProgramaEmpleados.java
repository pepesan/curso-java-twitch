package com.cursosdedesarrollo.sesion07.main;

import com.cursosdedesarrollo.sesion07.Currito;
import com.cursosdedesarrollo.sesion07.Empleado;
import com.cursosdedesarrollo.sesion07.Jefe;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        System.out.println(empleado);
        // nombre, dni, tlf, sueldo, cargo
        Empleado empleado2 = new Empleado(
                "David",
                "079988776A",
                "656667788",
                75000.0,
                "CEO"
        );
        System.out.println(empleado2);
        empleado.setNombre("David");
        System.out.println(empleado.getNombre());
        empleado.setDni("079988776A");
        System.out.println(empleado.getDni());
        empleado.setTlf("656667788");
        System.out.println(empleado.getTlf());
        empleado.setSueldo(75000.0);
        System.out.println(empleado.getSueldo());
        empleado.setCargo("CEO");
        System.out.println(empleado.getCargo());
        System.out.println(empleado);
        Jefe jefe = new Jefe();
        System.out.println(jefe);
        jefe.setSueldo(15000.0);
        System.out.println(jefe.getSueldo());
        Currito currito = new Currito();
        System.out.println(currito);
        currito.setSueldo(40000.0);
        System.out.println(currito.getSueldo());
    }
}
