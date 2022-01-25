package default_package;

public class ContaPoupanca extends Conta{
	
	// constructor
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupanca:");
		super.imprimirInfosComuns();
	}
	
}
