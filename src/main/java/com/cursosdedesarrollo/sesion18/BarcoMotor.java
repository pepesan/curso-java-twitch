package com.cursosdedesarrollo.sesion18;

import java.util.Objects;

// herencia de Barco
public class BarcoMotor extends Barco{
    private Float potenciaCaballos;

    public BarcoMotor() {
        super();
        this.potenciaCaballos = 0.0F;
    }

    public BarcoMotor(String matricula, Float eslora, Integer agnoFabricacion, Float potenciaCaballos) {
        super(matricula, eslora, agnoFabricacion);
        this.potenciaCaballos = potenciaCaballos;
    }

    public Float getPotenciaCaballos() {
        return potenciaCaballos;
    }

    public void setPotenciaCaballos(Float potenciaCaballos) {
        this.potenciaCaballos = potenciaCaballos;
    }
    @Override
    public Float getModulo(){
        return super.getModulo()+this.potenciaCaballos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BarcoMotor that = (BarcoMotor) o;
        return Objects.equals(potenciaCaballos, that.potenciaCaballos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potenciaCaballos);
    }

    @Override
    public String toString() {
        return "BarcoMotor{" +
                "potenciaCaballos=" + potenciaCaballos +
                ", " +
                super.toString() +
                '}';
    }
}
