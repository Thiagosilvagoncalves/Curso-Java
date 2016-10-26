/*Exercício 3 
Sugerir melhoria
Crie um método mostra(), que não recebe nem devolve parâmetro algum e simplesmente imprime todos os atributos do nosso funcionário. Dessa 
maneira, você não precisa ficar copiando e colando um monte de System.out.println() para cada mudança e teste que fizer com cada um de 
seus funcionários, você simplesmente vai fazer:

        Funcionario f1 = new Funcionario();
        // brincadeiras com f1....
        f1.mostra();
Veremos mais a frente o método toString, que é uma solução muito mais elegante para mostrar a representação de um objeto como String, 
além de não jogar tudo pro System.out (só se você desejar).

O esqueleto do método ficaria assim:


        class Funcionario {

            // seus outros atributos e métodos

            void mostra() {
                System.out.println("Nome: " + this.nome);
                // imprimir aqui os outros atributos...
                // também pode imprimir this.calculaGanhoAnual()
            }
        }
Implemente e compartilhe o método mostra.*/

        class Funcionario {

            String nome;
			String CPF;
			String depto;
			Double Salario;
		    String datainsc;

            void mostra() {
				String sal = Double.toString(Salario);
                System.out.println("Nome: " + this.nome);
				System.out.println("CPF: " + this.CPF);
				System.out.println("Departamento: " + this.depto);
				System.out.println("Salário: " + sal);
				System.out.println("Data de inscrição: " + this.datainsc);
				
				}
        }
		class Programa {
			public static void main(String[] args){
				Funcionario f1 = new Funcionario();
				f1.nome = "Robson";
				f1.CPF = "122414234";
				f1.depto = "Financeiro";
				f1.Salario = 2500.0;
				f1.datainsc="24/05/1984";
				
				f1.mostra();
			}
		}