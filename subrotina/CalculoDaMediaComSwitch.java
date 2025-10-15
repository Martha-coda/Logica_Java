// Programa: Cálculo de Médias com Subrotinas
// Autor: Martha Valerio
// Descrição: Solicita ao usuário a quantidade de números (2 a 5) que deseja calcular a média
//              e utiliza subrotinas (métodos) específicas para cada quantidade para calcular
//              e exibir a média dos números informados.

import java.util.Scanner;

class Exercicio2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quantos números você deseja calcular a média? 2-5");
        int quantidade = scanner.nextInt();

        switch(quantidade) {
            case 2:
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Média: " + media2(num1, num2));
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                System.out.print("Digite o terceiro número: ");
                double num3 = scanner.nextDouble();
                System.out.println("Média: " + media3(num1, num2, num3));
                break;
            case 4:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                System.out.print("Digite o terceiro número: ");
                num3 = scanner.nextDouble();
                System.out.print("Digite o quarto número: ");
                double num4 = scanner.nextDouble();
                System.out.println("Média: " + media4(num1, num2, num3, num4));
                break;
            case 5:
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                System.out.print("Digite o terceiro número: ");
                num3 = scanner.nextDouble();
                System.out.print("Digite o quarto número: ");
                num4 = scanner.nextDouble();
                System.out.print("Digite o quinto número: ");
                double num5 = scanner.nextDouble();
                System.out.println("Média: " + media5(num1, num2, num3, num4, num5));
                break;
        }

        scanner.close();
    }

    public static double media2(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double media3(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static double media4(double num1, double num2, double num3, double num4) {
        return (num1 + num2 + num3 + num4) / 4;
    }

    public static double media5(double num1, double num2, double num3, double num4, double num5) {
        return (num1 + num2 + num3 + num4 + num5) / 5;
    }
}
