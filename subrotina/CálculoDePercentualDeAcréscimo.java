// Programa: Cálculo de Percentual de Acréscimo
// Autor: Martha Valerio
// Descrição: Solicita ao usuário o valor antigo e o valor atual de um produto,
//              calcula o percentual de acréscimo entre eles utilizando uma subrotina
//              e exibe o resultado na tela.

import java.util.Scanner;

class CalculoPercentual {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor antigo do produto:");
        double valorAntigo = leitor.nextDouble();
        System.out.println("Digite o valor atual do produto:");
        double valorAtual = leitor.nextDouble();

        System.out.println("Teve um percentual de acréscimo de " + Resultado(valorAntigo, valorAtual));
    }

    public static double Resultado(double valorAntigo, double valorAtual) {
        double percentual = ((valorAtual - valorAntigo) / valorAntigo) * 100;
        return percentual;
    }
}
