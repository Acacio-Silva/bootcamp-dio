package labBancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente acacio = new Cliente();
		acacio.setNome("Acácio");
		
		Conta cc = new ContaCorrente(acacio);
		Conta poupanca = new ContaPoupanca(acacio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
