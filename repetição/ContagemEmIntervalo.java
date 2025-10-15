// Programa: Contagem em Intervalo
// Autor: Martha Valerio
// Descrição: Solicita ao usuário uma quantidade de números e, em seguida, lê cada número,
//              informando quantos estão dentro do intervalo de 10 a 20 ("in") e quantos estão fora ("out").

import java.util.Scanner;

class Intervalo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade:");
        int qtd = leitor.nextInt();

        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite um numero:");
            int numero = leitor.nextInt();

            if (numero >= 10 && numero <= 20) {
                cont1 = cont1 + 1;
            } else {
                cont2 = cont2 + 1;
            }
        }
        System.out.println(cont1 + " in");
        System.out.println(cont2 + " out");
    }
}
