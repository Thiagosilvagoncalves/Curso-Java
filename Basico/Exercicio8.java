/*(opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, (por exemplo 13), temos um novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é ímpar, x = 3 * x + 1
imprime x
o programa deve parar quando x == 1
Por exemplo, para x = 13 a saída deve ser:

13 > 40 > 20 > 10 > 5 > 16 > 8 > 4 > 2 > 1

Imprimindo sem pular linha

Um detalhe importante é que uma quebra de linha é impressa toda vez que chamamos println. Para não pular uma linha, usamos o código a seguir:

            System.out.print(variavel);*/

class exercicio8{
    public static void main(String[] args){
      
        int x = 13;
        System.out.println("Iniciando...\n");
        while (x != 1) {
            System.out.print(x + " > ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x =(( 3 * x) + 1);
            }
        }
        System.out.print(x);
	}	 
}

