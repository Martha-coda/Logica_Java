// Programa: Números Ímpares
// Autor: Martha Valerio
// Descrição: Solicita ao usuário um número inteiro e imprime todos os números ímpares de 1 até o número informado.

import java.util.Scanner;

class Impares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = leitor.nextInt();

        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}
