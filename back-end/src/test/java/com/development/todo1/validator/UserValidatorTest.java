package com.development.todo1.validator;

import org.apache.juli.logging.Log;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void delete() {
        Long code = 1L;
        Long expected = code;
        if(code==null){
            assertNotEquals(expected,null);
        }else{
            assertEquals(code,1L);
        }
    }
}