package com.development.todo1.service;

import com.development.todo1.entity.BillEntity;

import java.util.List;

public interface BillService {

    /**
     * <h1>Servicios</h1>
     * Un manto para identificar las propiedades que se implementaran en el
     * reposirotio usando un CRUD (FindAll, Save, Update)
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-01
     */
    List<BillEntity> findAll();
    BillEntity save(BillEntity billEntity);
    BillEntity upDate(BillEntity billEntity);
}
