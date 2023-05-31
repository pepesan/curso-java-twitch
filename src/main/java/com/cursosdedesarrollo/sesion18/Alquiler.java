package com.cursosdedesarrollo.sesion18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Alquiler {
    private String nombre;
    private String documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posicionAmarre;
    // Encapsulamiento (Objeto dentro de otro objeto) 1:1
    private Barco barco;
    public Alquiler() {
        this.nombre = "";
        this.documento = "";
        this.fechaAlquiler = LocalDate.of(2023, 5, 31);
        this.fechaDevolucion = LocalDate.of(2023, 5, 31);
        this.posicionAmarre = 0;
        this.barco = new Barco();
    }

    public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Long calcularDiferenciaEnDias() {
        return ChronoUnit.DAYS.between(this.fechaAlquiler, this.fechaDevolucion);
    }

    public Float calcularAlquiler(){
        return barco.getModulo()*calcularDiferenciaEnDias();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alquiler alquiler = (Alquiler) o;
        return Objects.equals(nombre, alquiler.nombre) && Objects.equals(documento, alquiler.documento) && Objects.equals(fechaAlquiler, alquiler.fechaAlquiler) && Objects.equals(fechaDevolucion, alquiler.fechaDevolucion) && Objects.equals(posicionAmarre, alquiler.posicionAmarre) && Objects.equals(barco, alquiler.barco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, documento, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", posicionAmarre=" + posicionAmarre +
                ", barco=" + barco +
                '}';
    }
}
