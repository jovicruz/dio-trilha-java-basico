public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(18);
        System.out.println("Soma total: " + numeros.calcularSoma());
        System.out.println("Maior Numero: " + numeros.encontrarMaiorNumero());
        System.out.println("Menor Numero: " + numeros.encontrarMenorNumero());
        numeros.exibirNumeros();
    }
}
