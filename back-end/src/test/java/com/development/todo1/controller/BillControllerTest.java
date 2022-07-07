package com.development.todo1.controller;

import com.development.todo1.entity.BillEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillControllerTest {

    @Test
    public void listBill(){
        BillEntity bill = new BillEntity();
        bill.setIdUser(1L);
        Long expected = bill.getIdUser();
        Long actual = 1L;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void saveBill(){
        BillEntity bill = new BillEntity();
        bill.setDescription("esteo");
        String expected = bill.getDescription();
        String actual = "esteo";
        Assertions.assertEquals(expected,actual);
    }

}