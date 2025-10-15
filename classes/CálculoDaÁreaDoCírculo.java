// Programa: Cálculo da Área de um Círculo 
// Autor: Martha Valerio
// Descrição: Define uma classe Circulo com atributo privado Raio, métodos getters e setters,
//              e um método para calcular a área. A classe Principal solicita ao usuário o valor do raio,
//              utiliza a subrotina para definir o raio e calcula a área do círculo, exibindo o resultado.

public class Circulo {
    private double Raio;

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double newRaio) {
        Raio = newRaio;
    }

    public double calcularArea() {
        return Math.PI * Raio * Raio;
    }
}

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo meuCirculo = new Circulo();

        System.out.println("Digite o valor do raio:");
        double valor = scan.nextDouble();

        meuCirculo.setRaio(valor);

        double area = meuCirculo.calcularArea();

        System.out.println("A área do círculo é: " + area);
    }
}
