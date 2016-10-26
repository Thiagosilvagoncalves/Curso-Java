//Adicione código (sem alterar as linhas que já existem) na classe anterior para imprimir a média mensal de gasto, criando uma variável mediaMensal junto com uma mensagem.
//Note que como somamos três meses a média será a soma dos três meses dividido por três.
//Para isso, concatene a String com o valor, usando algo como "Valor da média mensal = " + mediaMensal.
//O número foi arredondado? Compartilhe o código de sua classe.

class BalancoTrimestral {

	public static void main(String[] args){
	int	gastosJaneiro=15000;
	int gastosFevereiro=23000;
	int gastosMarco=17000;
	int mediaMensal=(gastosJaneiro+gastosFevereiro+gastosMarco)/3;
	
	int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
		System.out.println("Gasto do trimestre: R$ " + gastosTrimestre + "\nValor da Media Mensal: R$ "+ mediaMensal);
	}
}