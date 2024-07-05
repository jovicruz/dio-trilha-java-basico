import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public boolean getContasCliente(Cliente cliente) {
		if(contas.isEmpty() == false){
			for (Conta conta : contas) {
				if (conta.cliente.getNome() == cliente.getNome()) {
					return true;
				};
			}
		}
		return false;
	}

	public Conta getContaByAgenciaAndNumero(int numero, int agencia){
		for (Conta conta : contas) {
			if(conta.getAgencia() == agencia && conta.getNumero() == numero){
			return conta;
		}
		}
		return null;
	}

	public Conta getContaByCliente(Cliente cliente){
		for (Conta conta : contas) {
			if(conta.cliente == cliente){
			return conta;
		}
		}
		return null;
	}

	public void getClientes(){
		for (Cliente cliente : clientes) {
				System.out.println(cliente.getNome());
			}
		}
	

	public Cliente getClienteByNome(String nomecliente){
		for (Cliente cliente : clientes) {
				if(cliente.getNome().equals(nomecliente)){
				return cliente;
			}
		}
		return null;
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
