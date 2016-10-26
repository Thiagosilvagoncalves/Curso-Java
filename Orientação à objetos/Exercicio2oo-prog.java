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