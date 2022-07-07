package com.development.todo1.serviceImplement;

import com.development.todo1.dao.RolRepository;
import com.development.todo1.entity.RolEntity;
import com.development.todo1.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplement implements RolService {

    @Autowired
    protected RolRepository rolRepository;

    /**
     * <h1>findAll( Todos los roles )</h1>
     * Busca por la lista de roles en DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public List<RolEntity>  findAll(){
        System.out.println(this.rolRepository.findAll());
        return this.rolRepository.findAll();
    }

    /**
     * <h1>save( Guarda ROl )</h1>
     * Guarda los roles de tipo RolEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public RolEntity save(RolEntity rolEntity){
        return  this.rolRepository.save(rolEntity);
    }

    /**
     * <h1>upDate( Actualiza )</h1>
     * Actualiza los roles de tipo RolEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public RolEntity upDate(RolEntity rolEntity){
        return  this.rolRepository.save(rolEntity);
    }

    /**
     * <h1>delete( Todos los roles )</h1>
     * Actualiza el estado de true a false [State] de el Rol  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public RolEntity delete(RolEntity rolEntity){
        return  this.rolRepository.save(rolEntity);
    }

}


