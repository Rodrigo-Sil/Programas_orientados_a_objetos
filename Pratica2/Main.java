import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a matricula do aluno: ");
		int matricula = sc.nextInt();

		sc.nextLine(); //limpar o buffer do \n que sobrou

		System.out.print("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade do aluno:  ");
		int idade = sc.nextInt();

		sc.nextLine();

		System.out.print("Digite o nome da instituicao ao qual o aluno esta se matriculando: ");
		String instituicao = sc.nextLine();


		Aluno aluno1 = new Aluno(matricula, nome, idade, instituicao);

		String nomeMaiusculo = nome.toUpperCase();

		System.out.println("Atenção a chamada!");
		System.out.print("Ronaldo?\n");


		if (nomeMaiusculo.equals("RONALDO")) {

			System.out.printf("%s\n", aluno1.Resposta(nome));
		}else{

			System.out.printf("%s Faltou\n", nome);
		}
	}
}
