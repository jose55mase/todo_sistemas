package com.development.todo1.serviceImplement;

import com.development.todo1.dao.BillRepository;
import com.development.todo1.entity.BillEntity;
import com.development.todo1.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImplement implements BillService {

    @Autowired
    protected BillRepository billRepository;

    /**
     * <h1>findAll( Todos los Facturas )</h1>
     * Busca por la lista de facturas en DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public List<BillEntity> findAll(){
        return this.billRepository.findAll();
    }

    /**
     * <h1>save( Guarda Facturas )</h1>
     * Guarda los facturas de tipo BillEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public BillEntity save(BillEntity billEntity){
        return this.billRepository.save(billEntity);
    }

    /**
     * <h1>upDate( Actualiza )</h1>
     * Actualiza los facturas de tipo BillEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Override
    public BillEntity upDate(BillEntity billEntity){
        return this.billRepository.save(billEntity);
    }

}
