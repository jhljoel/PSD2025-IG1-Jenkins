package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

 class MarcoUtilTest {

    @Test
     void testGenerarMarco() {
        String input = "Hola mundo bonito";

        // Crear instancia ya que el método no es estático
        MarcoUtil marcoUtil = new MarcoUtil();
        List<String> resultado = marcoUtil.generarMarco(input);

        assertEquals(5, resultado.size());
        assertEquals("**********", resultado.get(0));
        assertEquals("* Hola   *", resultado.get(1));
        assertEquals("* mundo  *", resultado.get(2));
        assertEquals("* bonito *", resultado.get(3));
        assertEquals("**********", resultado.get(4));
    }
}



