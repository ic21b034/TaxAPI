package com.example.TaxAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestPrice {
    TaxCalculate taxCalculate = new TaxCalculate();
    @org.junit.jupiter.api.Test
    void returnTheRightPrice(){
        assertEquals(6,taxCalculate.taxCal(5));
    }
    @org.junit.jupiter.api.Test
    void returnTheWrongPrice(){
        assertNotEquals(8,taxCalculate.taxCal(5));
    }

}
