import java.util.Scanner;

public class NotaSemestral {

	public static void main(String[] args) {
		System.out.println("NOTA SEMESTRAL - TURMA A");
		Scanner ler = new Scanner(System.in);
		String nome;
		double Nprova1, Nprojeto1, Nexercícios1, Nmédia1;
		double Nprova2, Nprojeto2, Nexercícios2, Nmédia2;
		double Nprova3, Nprojeto3, Nexercícios3, Nmédia3;
		double Nmédiasemestre;
		
		System.out.print("Digite o nome do aluno: ");
		nome = ler.next();
		
		System.out.println("Insira as notas correspondentes de " + nome);
		
		// PRIMEIRO BIMESTRE
		
		do {
			System.out.println("Informe a nota da Prova do Bimestre 1: ");
			Nprova1 = ler.nextDouble();
		
		} while ( Nprova1 < 0 || Nprova1 > 10);
		
		do {
		
		System.out.print("Informe a nota do Projeto do Bimestre 1: ");
		Nprojeto1 = ler.nextDouble();
		
		} while( Nprojeto1 < 0 || Nprojeto1 > 10);
		
		do {
						
		System.out.print("Informe a nota da Lista de Exercícios do Bimestre 1: ");
		Nexercícios1 = ler.nextDouble();
		
		} while( Nexercícios1 < 0 || Nexercícios1 > 10);
		
		// SEGUNDO BIMESTRE
		
		do {
			System.out.println("Informe a nota da Prova do Bimestre 2: ");
			Nprova2 = ler.nextDouble();
		
		} while ( Nprova2 < 0 || Nprova2 > 10);
		
		do {
		
		System.out.print("Informe a nota do Projeto do Bimestre 2: ");
		Nprojeto2 = ler.nextDouble();
		
		} while( Nprojeto2 < 0 || Nprojeto2 > 10);
		
		do {
						
		System.out.print("Informe a nota da Lista de Exercícios do Bimestre 2: ");
		Nexercícios2 = ler.nextDouble();
		
		} while( Nexercícios2 < 0 || Nexercícios2 > 10);
		
		// TERCEIRO BIMESTRE
		
				do {
					System.out.println("Informe a nota da Prova do Bimestre 3: ");
					Nprova3 = ler.nextDouble();
				
				} while ( Nprova3 < 0 || Nprova3 > 10);
				
				do {
				
				System.out.print("Informe a nota do Projeto do Bimestre 3: ");
				Nprojeto3 = ler.nextDouble();
				
				} while( Nprojeto3 < 0 || Nprojeto3 > 10);
				
				do {
								
				System.out.print("Informe a nota da Lista de Exercícios do Bimestre 3: ");
				Nexercícios3 = ler.nextDouble();
				
				} while( Nexercícios3 < 0 || Nexercícios3 > 10);	
		
		Nmédia1 = (Nprova1*5 + Nprojeto1*3 + Nexercícios1*2)/10;
		Nmédia2 = (Nprova2*5 + Nprojeto2*3 + Nexercícios2*2)/10;
		Nmédia3 = (Nprova3*5 + Nprojeto3*3 + Nexercícios3*2)/10;
		Nmédiasemestre = (Nmédia1 + Nmédia2 + Nmédia3)/3;
		
		
		System.out.printf("A média semestral final de " +  nome + " é " +  Nmédiasemestre + "." );
	

	}

}
