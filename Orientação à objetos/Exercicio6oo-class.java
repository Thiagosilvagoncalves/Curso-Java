        class Funcionario {

            String nome;
			String CPF;
			String depto;
			Double Salario;
		    Data datainsc;
			
            void mostra() {
				String sal = Double.toString(Salario);
                System.out.println("Nome: " + this.nome);
				System.out.println("CPF: " + this.CPF);
				System.out.println("Departamento: " + this.depto);
				System.out.println("Salário: " + sal);
				System.out.println("Data de Entrada: " + this.datainsc.getFormatada());
				
				}
        }
		
			class Data {
			int dia;
			int mes;
			int ano;
		
			void preencheData (int dia, int mes, int ano){
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			}
			String getFormatada(){
				return this.dia + "/" + this.mes + "/" + this.ano;
			}
		}
		
		class Programa {
			public static void main(String[] args){
				Funcionario f1 = new Funcionario();
				f1.nome = "Robson";
				f1.CPF = "122414234";
				f1.depto = "Financeiro";
				f1.Salario = 2500.0;
				f1.datainsc= new Data();
				f1.datainsc.preencheData(1,3,1999);
				
				f1.mostra();
			}
		}