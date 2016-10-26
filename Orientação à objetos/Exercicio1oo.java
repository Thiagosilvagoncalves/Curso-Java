/*Exercício 1 Sugerir melhoria
Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário (double), a data de entrada no banco (String) e seu RG (String).
Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento. Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo o valor do salário multiplicado por 12..

A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que um funcionário faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.*/

class Funcionario {
	String nome;
	String depto;
	double salario;
	String dt_entrada;
	String rg;
	
	void recebeaumento(double valoraumento){
		this.salario += valoraumento;
	}


}
class Programa{
	public static void main(String[] args){
		Funcionario Robson = new Funcionario();
		Robson.nome = "Robson Del Valle";
		Robson.depto = "Financeiro";
		Robson.salario = 424000.0;
		Robson.dt_entrada = "23/06/1994";
		Robson.rg = "21234442-3";

	    double calculaGanhoAnual = (Robson.salario)*12;
		System.out.println(calculaGanhoAnual);
			
		Robson.recebeaumento(600.0);
			
		System.out.println(Robson.salario);
		
		System.out.println(calculaGanhoAnual);
	}
	
}