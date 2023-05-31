package com.cursosdedesarrollo.sesion18;

import java.util.Objects;

public class Barco {
    private String matricula;
    private Float eslora;
    private Integer agnoFabricacion;

    public Barco() {
        this.matricula = "";
        this.eslora = 0.0F;
        this.agnoFabricacion = 0;
    }

    public Barco(String matricula, Float eslora, Integer agnoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.agnoFabricacion = agnoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Float getEslora() {
        return eslora;
    }

    public void setEslora(Float eslora) {
        this.eslora = eslora;
    }

    public Integer getAgnoFabricacion() {
        return agnoFabricacion;
    }

    public void setAgnoFabricacion(Integer agnoFabricacion) {
        this.agnoFabricacion = agnoFabricacion;
    }

    public Float getModulo(){
        return this.eslora*10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barco barco = (Barco) o;
        return Objects.equals(matricula, barco.matricula) && Objects.equals(eslora, barco.eslora) && Objects.equals(agnoFabricacion, barco.agnoFabricacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, eslora, agnoFabricacion);
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", agnoFabricacion=" + agnoFabricacion +
                '}';
    }
}
