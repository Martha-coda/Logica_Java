// Programa: Verifica a posição de um ponto no plano cartesiano.
// Autor: Martha Valerio
// Descrição: Lê as coordenadas X e Y e informa em qual quadrante ou posição o ponto está localizado.
class OrigemDoPonto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a coordenada x:");
        double x = leitor.nextDouble();

        System.out.println("Digite a coordenada y:");
        double y = leitor.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
    }
        leitor.close();
    }
}
