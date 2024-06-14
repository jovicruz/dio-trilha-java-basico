
public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("Metodos de Aparelho Telefonico");
        iphone.atender();
        iphone.ligar("123456789");
        iphone.iniciarCorreioVoz();

        System.out.println("Metodos de Reprodutor Musical");
        iphone.selecionarMusica("Beware - Deftones");
        iphone.tocar();
        iphone.pausar();
        

        System.out.println("Metodos de Navegador Internet");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://web.dio.me");
        iphone.atualizarPagina();
    }
}
