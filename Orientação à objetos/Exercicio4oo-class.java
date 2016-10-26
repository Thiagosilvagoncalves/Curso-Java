/*Exercício 4 Sugerir melhoria
Construa dois funcionários com valores diferentes usando o new duas vezes.
Compare-os com o ==. E se eles tiverem os mesmos atributos? Para isso você vai precisar criar outra referência:


        Funcionario f1 = new Funcionario();        
        f1.nome = "Danilo";
        f1.salario = 100;

        Funcionario f2 = new Funcionario();        
        f2.nome = "Danilo";
        f2.salario = 100;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }
O que acontece se os valores são diferentes? E se são iguais?*/

        class Funcionario {

            String nome;
			String CPF;
			String depto;
			Double Salario;
		    String datainsc;

        }
		class Programa {
			public static void main(String[] args){
				Funcionario f1 = new Funcionario();
				f1.nome = "Robson";
				f1.CPF = "122414234";
				f1.depto = "Financeiro";
				f1.Salario = 2500.0;
				f1.datainsc="24/05/1984";
				
				Funcionario f2 = f1;

				       if (f1 == f2) {
				System.out.println("iguais");
				} else {
				System.out.println("diferentes");        
				}
			}
		}