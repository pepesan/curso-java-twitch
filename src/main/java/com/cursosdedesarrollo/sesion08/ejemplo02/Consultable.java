package com.cursosdedesarrollo.sesion08.ejemplo02;

public interface Consultable {
    // Buscar todos los Usuarios Almacenados
    public Usuario[] findAll();
    // Buscar un usuario por su Identificativo
    public Usuario findByID(Integer id);
    // Guardar un usuario  devuelve el ID
    public Integer save(Usuario usuario);
    // Actualizar los datos de un usuario mediante su ID
    public Boolean update (Integer id, Usuario usuario);
    // Borrar los datos de un usuario mediante su ID
    public Boolean delete(Integer id);
}
