package com.cursosdedesarrollo.sesion18;

import java.util.Objects;

// como es un barco tiene lo barco (herencia)
public class Velero extends Barco{
    private Integer numeroMastiles;

    public Velero() {
        super();
        this.numeroMastiles = 0;
    }

    public Velero(String matricula, Float eslora, Integer agnoFabricacion, Integer numeroMastiles) {
        super(matricula, eslora, agnoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public Float getModulo(){
        return super.getModulo()+this.numeroMastiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Velero velero = (Velero) o;
        return Objects.equals(numeroMastiles, velero.numeroMastiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroMastiles);
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numeroMastiles=" + numeroMastiles +
                " , " + super.toString() +
                '}';
    }
}
