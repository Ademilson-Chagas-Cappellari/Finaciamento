package com.finan.financiamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.finan.entities.Financing;

//Teste Construtor
public class FinancingTests {
    
    @Test
    public void constructorShouldCreateObjectWhenValidData(){
        //arrange
        //action
        Financing f = new Financing(100000.0, 2000.0, 80);
        //assert
        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }
    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Financing(100000.0, 2000.0, 20);
        } );
    }

    // Teste Sets
    @Test
    public void setTotalAmountShouldsetDatatWhenValidData(){
        //arrange
        Financing f = new Financing(100000.0, 2000.0, 80);
        
        //action 
        f.setTotalAmount(90000.0);

        //assert
        Assertions.assertEquals(90000.0, f.getTotalAmount());
        
    }
    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setTotalAmount(110000.0);
        } );
    }

}
