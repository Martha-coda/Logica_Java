// Programa: Cálculo de Média (Aritmética e Ponderada)
// Autor: Martha Valerio
// Descrição: Solicita ao usuário três notas e o tipo de média desejada (Aritmética ou Ponderada),
//              e utiliza uma subrotina (método) para calcular e exibir o resultado.

import java.util.Scanner;

class Exercicio6 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite sua primeira nota:");
        double n1 = leitor.nextDouble();
        System.out.println("Digite sua segunda nota:");
        double n2 = leitor.nextDouble();
        System.out.println("Digite sua terceira nota:");
        double n3 = leitor.nextDouble();

        System.out.println("Digite a letra A para média aritmética ou P para média ponderada:");
        char Letra = leitor.next().charAt(0);

        System.out.println("A média é " + Resultado(n1, n2, n3, Letra));
    }

    public static double Resultado(double n1, double n2, double n3, char Letra) {
        double Resposta;
        if (Letra == 'A' || Letra == 'a') {
            Resposta = (n1 + n2 + n3) / 3;
            return Resposta;
        } else if (Letra == 'P' || Letra == 'p') {
            // Assumindo pesos 5, 3, 2 (como no código da imagem)
            Resposta = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
            return Resposta;
        } else {
            return 0;
        }
    }
}
