package com.development.todo1.service;


import java.util.List;
import com.development.todo1.entity.RolEntity;


public interface RolService {

    /**
     * <h1>Servicios</h1>
     * Un manto para identificar las propiedades que se implementaran en el
     * reposirotio usando un CRUD (FindAll, Save, Delete, Update)
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */

    List<RolEntity> findAll();
    RolEntity save(RolEntity rolEntity);
    RolEntity upDate(RolEntity rolEntity);
    RolEntity delete(RolEntity rolEntity);
}
