import java.util.Scanner;

public class NotaSemestral {

	public static void main(String[] args) {
		System.out.println("NOTA SEMESTRAL - TURMA A");
		Scanner ler = new Scanner(System.in);
		String nome;
		double Nprova1, Nprojeto1, Nexerc�cios1, Nm�dia1;
		double Nprova2, Nprojeto2, Nexerc�cios2, Nm�dia2;
		double Nprova3, Nprojeto3, Nexerc�cios3, Nm�dia3;
		double Nm�diasemestre;
		
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
						
		System.out.print("Informe a nota da Lista de Exerc�cios do Bimestre 1: ");
		Nexerc�cios1 = ler.nextDouble();
		
		} while( Nexerc�cios1 < 0 || Nexerc�cios1 > 10);
		
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
						
		System.out.print("Informe a nota da Lista de Exerc�cios do Bimestre 2: ");
		Nexerc�cios2 = ler.nextDouble();
		
		} while( Nexerc�cios2 < 0 || Nexerc�cios2 > 10);
		
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
								
				System.out.print("Informe a nota da Lista de Exerc�cios do Bimestre 3: ");
				Nexerc�cios3 = ler.nextDouble();
				
				} while( Nexerc�cios3 < 0 || Nexerc�cios3 > 10);	
		
		Nm�dia1 = (Nprova1*5 + Nprojeto1*3 + Nexerc�cios1*2)/10;
		Nm�dia2 = (Nprova2*5 + Nprojeto2*3 + Nexerc�cios2*2)/10;
		Nm�dia3 = (Nprova3*5 + Nprojeto3*3 + Nexerc�cios3*2)/10;
		Nm�diasemestre = (Nm�dia1 + Nm�dia2 + Nm�dia3)/3;
		
		
		System.out.printf("A m�dia semestral final de " +  nome + " � " +  Nm�diasemestre + "." );
	

	}

}
