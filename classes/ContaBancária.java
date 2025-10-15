// Programa: Conta Bancária com Métodos de Depósito e Saque
// Autor: Martha Valerio
// Descrição: Define uma classe ContaBancaria com atributos privados Titular e Saldo,
//              métodos getters e setters, além de métodos para realizar depósitos e saques.
//              A classe main solicita valores ao usuário, realiza operações na conta e exibe
//              o saldo final juntamente com o titular.

public class ContaBancaria {
    private double Saldo;
    private String Titular;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void realizarDeposito(double valor) {
        if (valor > 0) {
            Saldo += valor;
            System.out.println("Deposito de R$" + valor + " no saldo. Total: " + Saldo);
        } else {
            System.err.println("Erro: Valor inválido");
        }
    }

    public void realizarSaque(double valor) {
        if (Saldo >= valor) {
            Saldo -= valor;
            System.out.println("Retirada de R$" + valor + " no saldo. Total: " + Saldo);
        } else {
            System.err.println("Erro: Saque não realizado");
        }
    }
}
import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        ContaBancaria conta = new ContaBancaria(); // Linha duplicada na imagem, mantida aqui

        conta.setTitular("Martha");

        conta.setSaldo(300);

        System.out.println("Digite o valor a ser depositado:");
        double valor = leitor.nextDouble();
        conta.realizarDeposito(valor);

        System.out.println("Digite o valor a ser retirado:");
        double valor1 = leitor.nextDouble();
        conta.realizarSaque(valor1);

        System.out.println("Titular: " + conta.getTitular() + " | Saldo final: R$ " + conta.getSaldo());

        leitor.close();
    }
}
