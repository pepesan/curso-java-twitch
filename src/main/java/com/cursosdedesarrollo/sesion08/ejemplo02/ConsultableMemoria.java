package com.cursosdedesarrollo.sesion08.ejemplo02;

public class ConsultableMemoria implements Consultable{

    private Usuario[] usuarios;
    private Integer numUsuarios;

    ConsultableMemoria(){
        usuarios = new Usuario[10];
        numUsuarios = 0;
    }
    @Override
    public Usuario[] findAll() {
        return usuarios;
    }

    @Override
    public Usuario findByID(Integer id) {
        return usuarios[id];
    }

    @Override
    public Integer save(Usuario usuario) {
        usuarios[numUsuarios] = usuario;
        usuario.setId(numUsuarios);
        numUsuarios++;
        return numUsuarios;
    }

    @Override
    public Boolean update(Integer id, Usuario usuario) {
        usuarios[id] = usuario;
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        // implementación de el borrado
        return true;
    }

}
