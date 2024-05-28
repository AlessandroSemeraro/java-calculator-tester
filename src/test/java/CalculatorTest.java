import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void somma() {
        assertEquals(5, Calculator.somma(3 ,2));
    }

    @Test
    void sottrazione() {
        assertEquals(5,Calculator.sottrazione(10,5));
    }

    @Test
    void divisione() {
        assertThrows(ArithmeticException.class,() -> Calculator.divisione(10,0));
        assertEquals(5,Calculator.divisione(10,2));
    }

    @Test
    void moltiplicazione() {
        assertEquals(10,Calculator.moltiplicazione(5,2));
    }
}