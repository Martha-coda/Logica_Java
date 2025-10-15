// Programa: Cálculo de Salário Líquido e Aumento de Empregado
// Autor: Martha Valerio
// Descrição: Define uma classe Empregado com atributos Nome, SalárioBruto e Descontos,
//              além de métodos para calcular o salário líquido e aumentar o salário por percentual.
//              A classe principal cria um empregado, exibe o salário líquido e calcula o aumento.

package Entidades;

public class Empregado {
    public String Nome;
    public double SalárioBruto;
    public double Descontos;

    public double SalárioLiquido() {
        double R1 = SalárioBruto - Descontos;
        return R1;
    }

    public double AumentarSalário(double percentual) {
        double R2 = SalárioBruto + (SalárioBruto * percentual / 100);
        return R2;
    }
}



import Entidades.Empregado;

public class program1 {
    public static void main(String[] args) {

        Empregado x = new Empregado();

        x.Nome = "Lucia";
        x.SalárioBruto = 2500.50;
        x.Descontos = 200.0;

        System.out.println("O Salário liquido: " + x.SalárioLiquido());
        System.out.println("O aumento do salário: " + x.AumentarSalário(10));
    }
}
