package default_package;

public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	// attributes
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	// constructor
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	// getters & setters
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}

	// methods
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente: %s", this.getCliente().getNome()));
		System.out.println(String.format("Agencia: %d", this.getAgencia()));
		System.out.println(String.format("Conta: %d", this.getNumero()));
		System.out.println(String.format("Saldo: R$ %.2f", this.getSaldo()));
	}
}
