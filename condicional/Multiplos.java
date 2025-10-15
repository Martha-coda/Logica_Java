// Programa: Verifica se dois números são múltiplos entre si.
// Autor: Martha Valerio
// Descrição: Lê dois números inteiros informados pelo usuário e verifica se um é múltiplo do outro.
// Exemplo de entrada:
// Primeiro número: 6
// Segundo número: 3
// Saída esperada: Os números são múltiplos.

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Os números são múltiplos.");
        } else {
            System.out.println("Os números não são múltiplos.");
        }

        leitor.close();
    }
}
