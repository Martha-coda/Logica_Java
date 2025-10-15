// Programa: Validação de Senha
// Autor: Martha Valerio
// Descrição: Solicita que o usuário digite uma senha até que a correta (2002) seja informada.
//              Permite até 5 tentativas e indica se a senha está válida ou inválida.

import java.util.Scanner;
 class Senha {
     public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);

         for (int i = 0; i < 5; i++) {
             System.out.println("Digite a senha:");
             int senha = leitor.nextInt();

            if (senha == 2002) {
                System.out.println("Senha válida!");
                break;
            } else {
                System.out.println("Senha inválida!");
            }
        }
    }
}
