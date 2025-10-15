// Programa: Maior Valor e Posição no Vetor
// Autor: Martha Valerio
// Descrição: Solicita ao usuário uma quantidade de números, armazena-os em um vetor,
//              identifica o maior valor e exibe tanto o valor máximo quanto a posição
//              em que ele se encontra no vetor.

import java.util.Scanner;

class QualeMaior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar?");
        int qtd = leitor.nextInt();
        double[] n = new double[qtd];

        double maior = n[0];

        for (int i = 0; i < n.length; i++) {
            System.out.printf("Digite um numero:");
            n[i] = leitor.nextDouble();

            if (i == 0) { 
                maior = n[i];
            } else if (maior < n[i]) {
                maior = n[i];
            }
        }

        System.out.printf("Maior Valor = %.2f%n", maior);
        for (int i = 0; i < n.length; i++) {
            if (n[i] == maior) {
                System.out.printf("Posição do maior valor = %d%n", i);
            }
        }
    }
}
