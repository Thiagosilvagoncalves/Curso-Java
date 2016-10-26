/*Exercício 2 Sugerir melhoria
Transforme o modelo abaixo em uma classe Java. Teste-a, usando uma outra classe que tenha o main. Você deve criar a classe do funcionário com o nome Funcionario, mas pode nomear como quiser a classe de testes. A de teste deve possuir o método main.
Um esboço da classe:
class Funcionario {

    double salario;
    // seus outros atributos e métodos

    void recebeAumento(double aumento) {
        // o que fazer aqui dentro?
    }

    double calculaGanhoAnual() {
        // o que fazer aqui dentro?
    }
}
Você pode (e deve) compilar seu arquivo java sem que você ainda tenha terminado sua classe Funcionario. Isso evitará que você receba dezenas de erros de compilação de uma vez só. Crie a classe Funcionario, coloque seus atributos e, antes de colocar qualquer método, compile o arquivo java. O arquivo Funcionario.class será gerado, mas não podemos "executá-lo" já que essa classe não tem um main. De qualquer forma, a vantagem é que assim verificamos que nossa classe Funcionario já está tomando forma e está escrita em sintaxe correta.
Esse é um processo incremental. Procure desenvolver assim seus exercícios, para não descobrir só no fim do caminho que algo estava muito errado.
Um esboço da classe que possui o main:

class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);

        System.out.println("salario atual:" + f1.salario);
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());
    }
}
Incremente essa classe. Faça outros testes, imprima outros atributos e invoque os métodos que você criou a mais.

Lembre-se de seguir a convenção java, isso é importantíssimo. Isto é, preste atenção nas maiúsculas e minúsculas, seguindo o seguinte exemplo: nomeDeAtributo, nomeDeMetodo, nomeDeVariavel, NomeDeClasse, etc...

Todas as classes no mesmo arquivo?

Você até pode colocar todas as classes no mesmo arquivo e apenas compilar esse arquivo. Ele vai gerar um .class para cada classe presente nele.

Porém, por uma questão de organização, é boa prática criar um arquivo .java para cada classe. Em capítulos posteriores, veremos também determinados casos nos quais você será obrigado a declarar cada classe em um arquivo separado.

Essa separação não é importante nesse momento do aprendizado, mas se quiser ir praticando sem ter que compilar classe por classe, você pode dizer para o javac compilar todos os arquivos java de uma vez:

javac *.java
Compartilhe sua classe Funcionario.
*/
class Funcionario {
	String nome;
	String depto;
	double salario;
	String dt_entrada;
	String rg;
	
	void recebeaumento(double valoraumento){
		this.salario += valoraumento;
		String salario2 = Double.toString(salario);
		System.out.println("Salário Atualizado: R$" + this.salario);
	}

}
