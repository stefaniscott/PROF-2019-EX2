package es.upm.grise;

import static org.junit.jupiter.api.Assertions.*; // Esto es JUnit 5
import org.junit.jupiter.api.Test;
import java.util.List;

public class ClaseExamenTest {

    @Test
    public void testSeis() throws EntradaInvalida {
        assertEquals(List.of(2, 3), ClaseExamen.primos(6));
    }

    @Test
    public void testTrece() throws EntradaInvalida {
        assertEquals(List.of(13), ClaseExamen.primos(13));
    }

    @Test
    public void testQuince() throws EntradaInvalida {
        assertEquals(List.of(3, 5), ClaseExamen.primos(15));
    }

    @Test
    public void testVeinticinco() throws EntradaInvalida {
        assertEquals(List.of(5, 5), ClaseExamen.primos(25));
    }

    @Test
    public void testEntradaInvalida() {
    assertThrows(EntradaInvalida.class, () -> {
        ClaseExamen.primos(1);
    });
}
    
}
