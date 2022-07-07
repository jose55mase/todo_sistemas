package com.development.todo1.serviceImplement;

import com.development.todo1.dao.UserRepository;
import com.development.todo1.entity.RolEntity;
import com.development.todo1.entity.UserEntity;
import com.development.todo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseServiceImplement implements UserService {

    /**
     * <h1>findAll( Todos los usuarios )</h1>
     * Busca por la lista de usuarios en DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> findAll(){
        return this.userRepository.findAll();
    }

    /**
     * <h1>save( Guarda USUARIO )</h1>
     * Guarda los ususarios de tipo UserEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public UserEntity save(UserEntity userEntity){
        return  this.userRepository.save(userEntity);
    }

    /**
     * <h1>upDate( Actualiza )</h1>
     * Actualiza los ususarios de tipo UserEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public UserEntity upDate(UserEntity userEntity){
        return  this.userRepository.save(userEntity);
    }

    /**
     * <h1>delete( Todos los usuarios )</h1>
     * Actualiza el estado logico de true a false [State] de el usuario  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public UserEntity delete(UserEntity userEntity){
        return  this.userRepository.save(userEntity);
    }
}
