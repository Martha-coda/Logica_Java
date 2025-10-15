// Programa: Sequência de Fibonacci
// Autor: Martha Valerio
// Descrição: Solicita ao usuário a quantidade de termos da sequência de Fibonacci e imprime os termos na tela.

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = leitor.nextInt();

        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i <= numero; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
