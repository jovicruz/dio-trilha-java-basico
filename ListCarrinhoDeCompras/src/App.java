public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem("fruta", 2, 4);
        carrinho.adicionarItem("mochila", 2, 2);

        carrinho.removerItem("fruta");

        carrinho.adicionarItem("patins", 10, 1);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
