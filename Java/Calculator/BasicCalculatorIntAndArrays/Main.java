package Calculator.BasicCalculatorIntAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Função para processar a entrada do usuário
       private static void processarEntrada(Calculadora calculadora, Scanner scanner, String operacao) {
        System.out.println("Digite dois números separados por espaço (ex: 5 3) ou dois arrays separados por exclamação (ex: 1 2 3!4 5 6):");
        String entrada = scanner.nextLine();
        if (entrada.isEmpty() || entrada.contains(",") || entrada.contains(".")) {
            System.out.println("Só é possível realizar operações com números inteiros.");
            return;
        }

        if (entrada.contains("!")) {
            // Processamento de arrays
            String[] partes = entrada.split("!");
            int[] arrayA = Arrays.stream(partes[0].trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arrayB = Arrays.stream(partes[1].trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] resultado = new int[arrayA.length];

            switch (operacao) {
                case "soma":
                    resultado = calculadora.soma(arrayA, arrayB);
                    break;
                case "subtracao":
                    resultado = calculadora.subtracao(arrayA, arrayB);
                    break;
                case "multiplicacao":
                    resultado = calculadora.multiplicacao(arrayA, arrayB);
                    break;
                case "divisao":
                    resultado = calculadora.divisao(arrayA, arrayB);
                    break;
            }
            System.out.println("Resultado da " + operacao + " de arrays: " + Arrays.toString(resultado));
        } else {
            // Processamento de inteiros
            int[] numeros = Arrays.stream(entrada.split(" ")).mapToInt(Integer::parseInt).toArray();
            int resultado = 0;

            switch (operacao) {
                case "soma":
                    resultado = calculadora.soma(numeros[0], numeros[1]);
                    break;
                case "subtracao":
                    resultado = calculadora.subtracao(numeros[0], numeros[1]);
                    break;
                case "multiplicacao":
                    resultado = calculadora.multiplicacao(numeros[0], numeros[1]);
                    break;
                case "divisao":
                    resultado = calculadora.divisao(numeros[0], numeros[1]);
                    break;
            }
            System.out.println("Resultado da " + operacao + ": " + resultado);
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação que deseja realizar (soma, subtracao, multiplicacao, divisao):");
        String operacao = scanner.nextLine();

        switch (operacao.toLowerCase()) {
            case "soma":
            case "subtracao":
            case "multiplicacao":
            case "divisao":
                processarEntrada(calculadora, scanner, operacao);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
