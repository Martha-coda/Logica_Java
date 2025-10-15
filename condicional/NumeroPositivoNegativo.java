// Programa: Verifica se o número é positivo ou negativo
// Autor: Martha Valerio
// Descrição: Lê um número e informa se ele é negativo ou não.

import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("O número não é negativo.");
        } else {
            System.out.println("O número é negativo.");
        }

        leitor.close();
    }
}
