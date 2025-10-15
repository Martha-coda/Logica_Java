// Programa: Estatísticas de Altura por Gênero
// Autor: Martha Valerio
// Descrição: Solicita ao usuário a altura e o gênero de um grupo de pessoas,
//              identifica a menor e a maior altura, calcula a média das alturas
//              das mulheres e dos homens e exibe a quantidade de homens no grupo.
import java.util.Scanner;

class Informacoes {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Quantas pessoas digitarão? ");
        int qtd = leitor.nextInt();
        
        double[] Altura = new double[qtd];
        char[] Genero = new char[qtd];
        
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite sua altura: ");
            leitor.nextLine(); // Consome o '\n' pendente
            Altura[i] = leitor.nextDouble();
            
            System.out.print("Digite seu genero (M/F): ");
            // Consome o '\n' pendente antes de ler o char
            leitor.nextLine(); 
            Genero[i] = leitor.next().toUpperCase().charAt(0);
        }
        
        double maiorAltura = Altura[0];
        double menorAltura = Altura[0];
        double somaAlturasMulheres = 0.0;
        double somaAlturasHomens = 0.0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;
        
        for (int i = 0; i < qtd; i++) {
            if (Altura[i] > maiorAltura) {
                maiorAltura = Altura[i];
            }
            if (Altura[i] < menorAltura) {
                menorAltura = Altura[i];
            }
            
            if (Genero[i] == 'F') {
                somaAlturasMulheres += Altura[i];
                quantidadeMulheres++;
            }
            
            if (Genero[i] == 'M') {
                somaAlturasHomens += Altura[i];
                quantidadeHomens++;
            }
        }
        
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        
        if (quantidadeMulheres > 0) {
            double mediaAlturasMulheres = somaAlturasMulheres / quantidadeMulheres;
            System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturasMulheres);
        } else {
            System.out.println("Não há mulheres no grupo.");
        }
        
        if (quantidadeHomens > 0) {
            System.out.printf("Número de homens = %d%n", quantidadeHomens);
            double mediaAlturasHomens = somaAlturasHomens / quantidadeHomens;
            System.out.printf("Média das alturas dos homens = %.2f%n", mediaAlturasHomens);
        } else {
            System.out.println("Não há homens no grupo.");
        }
    }
}
