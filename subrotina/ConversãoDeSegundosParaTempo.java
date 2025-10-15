// Programa: Conversão de Segundos em Horas, Minutos e Segundos
// Autor: Martha Valerio
// Descrição: Solicita ao usuário um valor em segundos e utiliza uma subrotina com estrutura
//              de classe auxiliar para converter o total em horas, minutos e segundos,
//              exibindo o resultado formatado na tela.

import java.util.Scanner;

class Coversao {
    static Scanner leitor = new Scanner(System.in);

    public static class Tempo {
        public int horas;
        public int minutos;
        public int segundos;
    }

    public static void main(String[] args) {
        System.out.println("Digite o número de segundos:");
        int totalSegundos = leitor.nextInt();

        Tempo resultado = converterSegundos(totalSegundos);

        System.out.println("Resultado:");
        System.out.println("Horas: " + resultado.horas);
        System.out.println("Minutos: " + resultado.minutos);
        System.out.println("Segundos: " + resultado.segundos);
    }

    public static Tempo converterSegundos(int totalSegundos) {
        Tempo tempo = new Tempo();
        tempo.horas = totalSegundos / 3600;
        tempo.minutos = (totalSegundos % 3600) / 60;
        tempo.segundos = totalSegundos % 60;
        return tempo;
    }
}
