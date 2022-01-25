package default_package;

public class ContaCorrente extends Conta{
	
	// constructor
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente:");
		super.imprimirInfosComuns();
	}
	
}
