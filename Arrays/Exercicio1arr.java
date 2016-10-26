/*Exercício 1 Sugerir melhoria
Volte ao nosso sistema de Funcionario e crie uma classe Empresa dentro do mesmo arquivo .java.
A Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, além de outros atributos que você julgar necessário.

Compartilhe sua classe Empresa.*/

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;
	int a = 0;
	
	
	void adiciona (Funcionario f) {
			this.empregados[this.a]=f;
			this.a++;
	}
}

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