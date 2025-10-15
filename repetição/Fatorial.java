// Programa: Fatorial
// Autor: Martha Valerio
// Descrição: Solicita ao usuário um número inteiro e calcula o fatorial desse número, exibindo o resultado na tela.
import java.util.Scanner;

class CalcularFatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int numero = leitor.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é " + fatorial);
    }
}
