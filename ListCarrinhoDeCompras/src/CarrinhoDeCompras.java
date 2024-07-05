import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemLista;

    public CarrinhoDeCompras(){
        itemLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item novoItem = new Item(nome, preco, quantidade);
        itemLista.add(novoItem);
    }

    public void removerItem(String nome){
        for (Item i : itemLista){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemLista.remove(i);
            }
        }
    }

    public void exibirItens(){
        for (Item i : itemLista){
            System.out.println("Nome: " + i.getNome());
            System.out.println("Preço: " + i.getPreco());
            System.out.println("Quantidade: " + i.getQuantidade());
            System.out.println("------------------------");
        }
    }

    public void calcularValorTotal(){
        double valor = 0;
        for(Item i : itemLista){
           valor += i.getPreco() * i.getQuantidade();
        }
        System.out.println("Valor total do carrinho: " + valor);
    }


}
