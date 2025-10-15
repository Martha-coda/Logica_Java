// Programa: Verifica se o número é par ou impar.
// Autor: Martha Valerio
// Descrição: Lê um número e informa se ele é par ou não.
class ParImpar {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int Numero = leitor.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        leitor.close();
    }
}
