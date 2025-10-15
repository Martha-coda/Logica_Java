// Programa: Cálculo de Área, Perímetro e Diagonal do retangulo.
// Autor: Martha Valerio
// Descrição: Define uma classe Retangulo com atributos Altura e Largura, 
//              além de métodos para calcular a área, o perímetro e a diagonal.
//              A classe principal cria um objeto Retangulo, atribui valores e exibe os resultados.

package Entidades;

public class Retangulo {
    public double Altura;
    public double Largura;

    public double Area() {
        double R1 = Altura * Largura;
        return R1;
    }

    public double Perimetro() {
        double R2 = Altura * 2 + Largura * 2;
        return R2;
    }

    public double Diagonal() {
        // A fórmula na imagem parece ser para raiz quadrada da soma dos quadrados:
        // double R3 = Largura * Largura + Altura * Altura;
        double R3 = Largura * Largura + Altura * Altura;
        return Math.sqrt(R3);
    }
}


import Entidades.Retangulo;

public class program {
    public static void main(String[] args) {
        Entidades.Retangulo x;
        
        x = new Retangulo();

        x.Altura = 4.0;
        x.Largura = 7.0;

        System.out.println("A área de x: " + x.Area());
        System.out.println("O perímetro de x: " + x.Perimetro());
        System.out.println("A diagonal de x: " + x.Diagonal());
    }
}
