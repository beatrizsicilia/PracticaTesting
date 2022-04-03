package com.icai.practicas.model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DNITest {
    @Test
    public void testingDNI() {

         // DNI que no son válidos (ENUNCIADO)
         DNI dni = new DNI("00000000T");
         assertEquals(false, dni.validar());
         dni = new DNI("00000001R");
         assertEquals(false, dni.validar());
         dni = new DNI("99999999R");
         assertEquals(false, dni.validar());

        //NO TIENEN FORMATO DNI
        dni = new DNI("H123456789");
        assertEquals(false, dni.validar());
        dni = new DNI("ASDFGHJKLZ");
        assertEquals(false, dni.validar());
        dni = new DNI("0102");
        assertEquals(false, dni.validar());

       

        // DNI correctos
        dni = new DNI("12345678Z");
        assertEquals(true, dni.validar());
        dni = new DNI("12345678H");
        assertEquals(true, dni.validar());

        
    }
    
}
