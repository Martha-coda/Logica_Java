// Programa: Calculadora com Subrotinas
// Autor: Martha Valerio
// Descrição: Solicita ao usuário dois valores e o tipo de operação desejada (soma, subtração,
//              multiplicação ou divisão) e utiliza subrotinas (métodos) para realizar o cálculo
//              e exibir o resultado.

import java.util.Scanner;

class Calculadora {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor:");
        double n1 = leitor.nextDouble();
        System.out.println("Digite o segundo valor:");
        double n2 = leitor.nextDouble();

        System.out.println("Escolha o tipo de operação:");
        System.out.println("1 - Soma 2 - Subtração 3 - Multiplicação 4 - Divisão");
        int opcao = leitor.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Resultado: " + somar(n1, n2));
                break;
            case 2:
                System.out.println("Resultado: " + subtrair(n1, n2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(n1, n2));
                break;
            case 4:
                System.out.println("Resultado: " + dividir(n1, n2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

        leitor.close();
    }

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public static double dividir(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return n1 / n2;
    }
}
