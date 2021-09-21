import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {
		System.out.println("NEXT LEVEL - NOTA SEMESTRAL - ALUNOS");
		
		Scanner ler = new Scanner(System.in);
		String nome;
		double Prova, Projeto, Exercícios, Contribuição, Média, Final;
		System.out.print("Digite seu nome: ");
		nome = ler.next();
				
		System.out.println("Seja bem vindo " + nome);
		
		System.out.println("Para verificar a sua média semestral, preciso que me informe as notas nas atividades correspondentes");
		
				
		System.out.print("Informe a nota da Prova: ");
		Prova = ler.nextDouble();
		
		System.out.print("Informe a nota do Projeto: ");
		Projeto = ler.nextDouble();
		
		System.out.print("Informe a nota da Lista de Exercícios: ");
		Exercícios = ler.nextDouble();
		
		System.out.print("Informe a nota da Contribuição em Projetos: ");
		Contribuição = ler.nextDouble();
		
		Média = (Prova*3 + Projeto*3 + Exercícios*2 + Contribuição*2 )/10;
		
		Final = (10 - Média);
				
		System.out.println("A sua média semestral é " + Média);
		
		if (Média >= 8){
		System.out.println("VOCÊ FOI APROVADO");
		} else {
				
		System.out.println("PARA SER APROVADO, VOCÊ PRECISA TIRAR " + Final + " NA PROVA FINAL");
		}
		
		
		
		

			}

}
