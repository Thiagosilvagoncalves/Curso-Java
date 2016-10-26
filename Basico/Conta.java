//Aprendendo Orientação a Objetos

class Conta {
	int numero;
	String titular;
	double saldo;
	int agencia;
	
	void deposita(double valoraserdepositado){
		this.saldo += valoraserdepositado;
	}
	
	void saca(double valorasersacado){
		if(this.saldo >= valorasersacado){
			this.saldo -= valorasersacado;
		} else {
			System.out.println("Saldo insulficiente para saque.");
		}
	}
	
	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Programa{
	public static void main(String[] args){
		Conta Thiago = new Conta();
		Thiago.numero = 123;
		Thiago.saldo = 2123.0;
		Thiago.titular = "Thiago Gonçalves";
		Thiago.agencia = 442;
		
		Thiago.deposita(500.0);
		Thiago.saca(64000.0);
		
		Conta alex = new Conta();
		alex.numero = 1323;
		alex.saldo = 2313.3;
		alex.titular = "Alex Nogueira";
		alex.agencia = 232;
		
		System.out.println(Thiago.saldo);
		System.out.println(alex.saldo);
		alex.transfere(1000.0,Thiago);
		System.out.println(Thiago.saldo);
		
	}
}