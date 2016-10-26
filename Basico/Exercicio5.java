/*Exercício 5 Sugerir melhoria
Utilizando um laço do tipo for imprima todos os múltiplos de 3, entre 1 e 100. Existem duas maneiras tradicionais de resolver este problema.
Uma delas consiste em fazer o for, e utilizar numero % 3 para descobrir o resto da divisão de um número por 3. Se o resto for zero, ele é divisível por 3. Como em:
if(numero % 3 == 0) {
   faça algo
}
*/Outra abordagem é fazer um laço um pouco diferente, que pula já direto pelos múltiplos de três. Existem outras abordagens, escolha a sua e compartilhe ela aqui.


class exercicio5{
    public static void main(String[] args){
      
/*        for (int i = 1; i < 100; i++){
            if(i % 3 == 0) {
			   System.out.println("O Numero: "+i+" e divisivel por 3.");
		}	 
	}
*/		


		for (int i = 3; i < 100; i+=3 ){
			System.out.println(i);
        }
    }
}