// Programa: Alunos Aprovados
// Autor: Martha Valerio
// Descrição: Solicita ao usuário o nome e duas notas de uma quantidade de alunos,
//              calcula a média de cada aluno e exibe os nomes daqueles cuja média é
//              igual ou superior a 6, indicando os aprovados.

import java.util.Scanner;

class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int qtd = scanner.nextInt();

        String[] nomes = new String[qtd];
        double[] nota1 = new double[qtd];
        double[] nota2 = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            scanner.nextLine(); 
            System.out.printf("Digite o nome do aluno: ");
            nomes[i] = scanner.nextLine();

            System.out.printf("Digite a primeira nota do aluno: ");
            nota1[i] = scanner.nextDouble();

            System.out.printf("Digite a segunda nota do aluno: ");
            nota2[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < qtd; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;

            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
        scanner.close();
    }
}
