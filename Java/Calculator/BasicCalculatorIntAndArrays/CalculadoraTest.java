package Calculator.BasicCalculatorIntAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.soma(2, 3));
    }
    
    @Test
    public void testSomaArrays() {
        Calculadora calculadora = new Calculadora();
        int[] arrayA = {1, 2};
        int[] arrayB = {3, 4};
        assertArrayEquals(new int[]{4, 6}, calculadora.soma(arrayA, arrayB));
        assertThrows(IllegalArgumentException.class, () -> {
            int[] arrayC = {1, 2};
            int[] arrayD = {3, 4, 5};
            calculadora.soma(arrayC, arrayD);
        });
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtracao(3, 2));
    }
    @Test
    public void testSubtracaoArrays() {
        Calculadora calculadora = new Calculadora();
        int[] arrayA = {3, 4};
        int[] arrayB = {1, 2};
        assertArrayEquals(new int[]{2, 2}, calculadora.subtracao(arrayA, arrayB));
        assertThrows(IllegalArgumentException.class, () -> {
            int[] arrayC = {1, 2};
            int[] arrayD = {3, 4, 5};
            calculadora.subtracao(arrayC, arrayD);
        });
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicacao(2, 3));
    }
    @Test
    public void testMultiplicacaoArrays() {
        Calculadora calculadora = new Calculadora();
        int[] arrayA = {1, 2};
        int[] arrayB = {3, 4};
        assertArrayEquals(new int[]{3, 8}, calculadora.multiplicacao(arrayA, arrayB));
        assertThrows(IllegalArgumentException.class, () -> {
            int[] arrayC = {1, 2};
            int[] arrayD = {3, 4, 5};
            calculadora.multiplicacao(arrayC, arrayD);
        });
    }


    @Test
    public void testDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.divisao(6, 3));
        assertThrows(ArithmeticException.class, () -> {
            calculadora.divisao(6, 0);
        });
    }
    @Test
    public void testDivisaoArrays() {
        Calculadora calculadora = new Calculadora();
        int[] arrayA = {6, 8};
        int[] arrayB = {3, 2};
        assertArrayEquals(new int[]{2, 4}, calculadora.divisao(arrayA, arrayB));
        assertThrows(IllegalArgumentException.class, () -> {
            int[] arrayC = {1, 2};
            int[] arrayD = {3, 4, 5};
            calculadora.divisao(arrayC, arrayD);
        });
    }
}
