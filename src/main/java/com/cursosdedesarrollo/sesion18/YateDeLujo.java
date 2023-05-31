package com.cursosdedesarrollo.sesion18;

import java.util.Objects;

// herencia de BarcoMotor
public class YateDeLujo extends BarcoMotor{
    private Integer numeroCamarotes;

    public YateDeLujo() {
        super();
        this.numeroCamarotes = 0;
    }

    public YateDeLujo(String matricula, Float eslora, Integer agnoFabricacion, Float potenciaCaballos, Integer numeroCamarotes) {
        super(matricula, eslora, agnoFabricacion, potenciaCaballos);
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        YateDeLujo that = (YateDeLujo) o;
        return Objects.equals(numeroCamarotes, that.numeroCamarotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroCamarotes);
    }

    @Override
    public Float getModulo(){
        return super.getModulo()+this.numeroCamarotes;
    }

    @Override
    public String toString() {
        return "YateDeLujo{" +
                "numeroCamarotes=" + numeroCamarotes +
                ", " +
                super.toString() +
                '}';
    }
}
