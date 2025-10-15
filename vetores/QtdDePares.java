// Programa: Números Pares no Vetor
// Autor: Martha Valerio
// Descrição: Solicita ao usuário uma quantidade de números, armazena-os em um vetor,
//              identifica e exibe todos os números pares, além de mostrar a quantidade total
//              de valores pares encontrados.
import java.util.Scanner;

class Pares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar?");
        int qtd = leitor.nextInt();
        int[] n = new int[qtd];

        int cont = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.printf("Digite um numero:");
            n[i] = leitor.nextInt();
        }

        System.out.println("Numeros pares:");

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.println(n[i] + " ");
                cont += 1;
            }
        }
        System.out.println("Quantidade de pares = " + cont);
    }
}
