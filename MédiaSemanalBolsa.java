import java.util.Scanner; 

public class M�diaSemanalBolsa 

	public static void main(String[] args) {
		
				
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o n�mero de Semanas:");
		int semana = ler.nextInt();
		
		System.out.printf("Informe o n�mero de Dias por Semana:");
		int dias = ler.nextInt();
		
		int �ndice [][] = new int [semana][dias];
					
		
		ler = new Scanner(System.in);
							
		for (int i = 0; i < semana; i++) 
		{
			for (int j = 0; j < dias; j++) 
			{	System.out.printf("Informe o valor da A��o na Semana %d e no Dia %d dessa mesma semana:", i+1, j+1);
				�ndice [i] [j] = ler.nextInt();
			}	
		}
		
		for(int i = 0; i < semana; i++)
		{
			System.out.println();
			for(int j = 0; j < dias; j++) 			
						System.out.print(�ndice[i][j]+"\t");
		}}}
		
			
		
				
		
									
	
	


