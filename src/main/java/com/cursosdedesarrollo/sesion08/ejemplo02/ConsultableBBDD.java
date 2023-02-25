package com.cursosdedesarrollo.sesion08.ejemplo02;

public class ConsultableBBDD implements Consultable{
    @Override
    public Usuario[] findAll() {
        return new Usuario[0];
    }

    @Override
    public Usuario findByID(Integer id) {
        return null;
    }

    @Override
    public Integer save(Usuario usuario) {
        return null;
    }

    @Override
    public Boolean update(Integer id, Usuario usuario) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }
}
