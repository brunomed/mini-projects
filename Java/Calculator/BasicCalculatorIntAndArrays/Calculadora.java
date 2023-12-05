package Calculator.BasicCalculatorIntAndArrays;

public class Calculadora {

//Calculadora simples com soma de arrays

    public int soma(int a, int b) {
        return a + b;
    }

    public int[] soma(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays devem ter o mesmo tamanho.");
        }
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }
    
    public int subtracao(int a, int b) {
        return a - b;
    }
    public int[] subtracao(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays devem ter o mesmo tamanho.");
        }
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] - b[i];
        }
        return resultado;
    }

    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }
     public int[] multiplicacao(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays devem ter o mesmo tamanho.");
        }
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] * b[i];
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
     public int[] divisao(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays devem ter o mesmo tamanho.");
        }
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] / b[i];
        }
        return resultado;
    }
}