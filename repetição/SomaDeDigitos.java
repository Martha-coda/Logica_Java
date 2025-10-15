// Programa: Soma de Dígitos
// Autor: Martha Valerio
// Descrição: Solicita ao usuário um número inteiro e calcula a soma de todos os seus dígitos, exibindo o resultado na tela.

import java.util.Scanner;

class SomadeDigitos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = leitor.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("Soma dos digitos: " + soma);
    }
}
