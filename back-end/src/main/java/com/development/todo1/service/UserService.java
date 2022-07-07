package com.development.todo1.service;

import com.development.todo1.entity.UserEntity;

import java.util.List;

public interface UserService {

    /**
     * <h1>Servicios</h1>
     * Identificar las propiedades que se implementaran en el
     * reposirotio usando un CRUD (FindAll, Save, Delete, Update)
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-31
     */
    List<UserEntity> findAll();
    UserEntity save(UserEntity userEntity);
    UserEntity upDate(UserEntity userEntity);
    UserEntity delete(UserEntity userEntity);
}