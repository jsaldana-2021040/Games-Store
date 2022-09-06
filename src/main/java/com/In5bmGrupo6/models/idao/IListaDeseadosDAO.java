package com.In5bmGrupo6.models.idao;

import com.In5bmGrupo6.models.domain.ListaDeseados;
import java.util.List;

/**
 *
 * @author Roberto Saldaña
 * @date 30-08-2022
 * @time 08:55:00 AM
 * Código Técnico; IN5BM
 */

public interface IListaDeseadosDAO {
    
    //Listar todos los registros
    public List<ListaDeseados> getAll(); 
    
    //Insertar registro
    public boolean add(ListaDeseados listaDeseados);
    
    //Actualizar un registro
    public boolean update(ListaDeseados listaDeseados); 
    
    //Eliminar registro
    public boolean delete(ListaDeseados listaDeseados);
}