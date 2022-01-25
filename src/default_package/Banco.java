package default_package;

import java.util.List;

public class Banco {
	// attributes
	private String nome;
	private List<Conta> contas;

	// getters & setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
