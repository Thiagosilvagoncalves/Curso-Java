//Imprima a soma de 1 até 1000 (inclusive).
//Para isso você deve utilizar alguma variável extra que armazena a soma temporária e aumentá-la a cada novo passo. Compartilhe sua solução.
//Compartilhe o seu código:

class Exercicio4 {
	
	public static void main(String[] args){
		int a = 1;
		int soma = 0;
		
		while(a <=1000){
			soma = soma + a;
			a++;
		}
		System.out.println("O Valor da Soma é =" + soma);
	}
}
class ImprimeSoma{
    public static void main(String[] args){

        int soma = 0;

        for (int i = 1; i <= 1000; i++){
            soma = soma + i;            
        }
        System.out.println("O valor da soma e = " + soma);
    }
}