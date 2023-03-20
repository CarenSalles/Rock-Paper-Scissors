package com.factoriaf5.rps.models;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PaperTest {

    @Test
    public void test_is_a_Paper() {
        Paper paper = new Paper();
        assertTrue(paper instanceof Paper); //significa que el objecto paper es instancia de la clase Paper.
        assertEquals("Paper", paper.getType());
        // Si espera que se tenga un metodo getType() que devolve que es de tipo string ("Paper").

    }
}

    
        
    


    

   