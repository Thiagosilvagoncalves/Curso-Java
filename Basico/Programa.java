class Programa{
	public static void main(String[] args){
	int idadeJoao = 18;
	int idadeMaria = 21;
	
	
	int somadasidades = idadeJoao + idadeMaria;
	System.out.println(somadasidades);
	System.out.println("Variavel Int armazena dados numéricos inteiros, não aceitando números com casa decimal e podendo fazer calculos com eles.");
	
	double pi = 3.1415;
	double dobropi = pi*2;
	System.out.println(dobropi);
	System.out.println("Variavel Double armazena dados numéricos com casa decimal.");
	
	boolean amigo = true;
	boolean inimigo = !amigo;
	System.out.println("Variavel boolean armazena dados do tipo lógico, no java é True ou False.");
	}
}