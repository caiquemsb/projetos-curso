import java.util.Scanner; 

public class MédiaSemanalBolsa 

	public static void main(String[] args) {
		
				
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número de Semanas:");
		int semana = ler.nextInt();
		
		System.out.printf("Informe o número de Dias por Semana:");
		int dias = ler.nextInt();
		
		int índice [][] = new int [semana][dias];
					
		
		ler = new Scanner(System.in);
							
		for (int i = 0; i < semana; i++) 
		{
			for (int j = 0; j < dias; j++) 
			{	System.out.printf("Informe o valor da Ação na Semana %d e no Dia %d dessa mesma semana:", i+1, j+1);
				índice [i] [j] = ler.nextInt();
			}	
		}
		
		for(int i = 0; i < semana; i++)
		{
			System.out.println();
			for(int j = 0; j < dias; j++) 			
						System.out.print(índice[i][j]+"\t");
		}}}
		
			
		
				
		
									
	
	


