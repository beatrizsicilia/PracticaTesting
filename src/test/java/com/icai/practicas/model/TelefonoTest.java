package com.icai.practicas.model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TelefonoTest {
    @Test
    public void testingTelefono() {

        //El método assertEquals funciona asi: si el resultado del metodo validar y el boolean que ponemos 
        //son iguales, el caso de testing pasa, si no no. //Existe tb NotEquals

        //VALIDOS
        Telefono tel = new Telefono("678678678");
        assertEquals(true, tel.validar());

        tel = new Telefono("649649649");
        assertEquals(true, tel.validar());

    
        //NO VALIDOS POR FORMATO (CORTOS O CN LETRAS)
        tel = new Telefono("789");
        assertEquals(false, tel.validar());
        
        tel = new Telefono("66666666A");
        assertEquals(false,tel.validar());

        tel = new Telefono("66261316366");
        assertEquals(false, tel.validar());
        tel = new Telefono("6613Hg163");
        assertEquals(false, tel.validar());
    }
}
