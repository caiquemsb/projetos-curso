import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {
		System.out.println("NEXT LEVEL - NOTA SEMESTRAL - ALUNOS");
		
		Scanner ler = new Scanner(System.in);
		String nome;
		double Prova, Projeto, Exerc�cios, Contribui��o, M�dia, Final;
		System.out.print("Digite seu nome: ");
		nome = ler.next();
				
		System.out.println("Seja bem vindo " + nome);
		
		System.out.println("Para verificar a sua m�dia semestral, preciso que me informe as notas nas atividades correspondentes");
		
				
		System.out.print("Informe a nota da Prova: ");
		Prova = ler.nextDouble();
		
		System.out.print("Informe a nota do Projeto: ");
		Projeto = ler.nextDouble();
		
		System.out.print("Informe a nota da Lista de Exerc�cios: ");
		Exerc�cios = ler.nextDouble();
		
		System.out.print("Informe a nota da Contribui��o em Projetos: ");
		Contribui��o = ler.nextDouble();
		
		M�dia = (Prova*3 + Projeto*3 + Exerc�cios*2 + Contribui��o*2 )/10;
		
		Final = (10 - M�dia);
				
		System.out.println("A sua m�dia semestral � " + M�dia);
		
		if (M�dia >= 8){
		System.out.println("VOC� FOI APROVADO");
		} else {
				
		System.out.println("PARA SER APROVADO, VOC� PRECISA TIRAR " + Final + " NA PROVA FINAL");
		}
		
		
		
		

			}

}
