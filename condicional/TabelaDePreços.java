// Programa: Calcula o valor total de um pedido com base no código do item e na quantidade.
// Autor: Martha Valerio
// Descrição: O usuário informa o código de um item e a quantidade desejada. 
// O programa calcula o valor total do pedido conforme a tabela de preços abaixo:
//
//  Código | Especificação | Preço
//  -------|----------------|-------
//    1    | Cachorro Quente| R$ 4.00
//    2    | X-Salada       | R$ 4.50
//    3    | X-Bacon        | R$ 5.00
//    4    | Torrada Simples| R$ 2.00
//    5    | Refrigerante   | R$ 1.50
//
// Exemplo de entrada: 
// Código: 2
// Quantidade: 3
// Saída esperada: Valor total: R$ 13.50

import java.util.Scanner;

public class Tabela {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código do item:");
        int codigo = leitor.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = leitor.nextInt();

        double valor;

        switch (codigo) {
            case 1:
                valor = quantidade * 4.00;
                break;
            case 2:
                valor = quantidade * 4.50;
                break;
            case 3:
                valor = quantidade * 5.00;
                break;
            case 4:
                valor = quantidade * 2.00;
                break;
            case 5:
                valor = quantidade * 1.50;
                break;
            default:
                System.out.println("Código inválido!");
                leitor.close();
                return;
        }

        System.out.printf("Valor total: R$ %.2f%n", valor);
        leitor.close();
    }
}
