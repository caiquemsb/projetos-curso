import java.util.Scanner;

public class Eventos {

	public static void main(String[] args) {
	System.out.println("INFORMAÇÕES DO EVENTO");	
	Scanner ler = new Scanner(System.in);
	String evento, responsável, telefone, palestrante1, start1, end1, descrição1, contato1, palestrante2, start2, end2, descrição2, contato2 ;
	double custor, custotr, chr, chp1, chp2, custop1, custop2, custotp1, custotp2;
	
	System.out.println("DIGITE O NOME DO EVENTO: ");
	evento = ler.nextLine();
	
	System.out.println("INFORME O NOME DO RESPONSÁVEL PELO EVENTO:");
	responsável = ler.nextLine();
	
	System.out.println("INFORME O TELEFONE DE CONTATO DO RESPONSÁVEL PELO EVENTO:");
	telefone = ler.nextLine();
	
	System.out.println("QUAL A DURAÇÃO EM HORAS DO EVENTO?");
	chr = ler.nextInt();
	
	System.out.println("INFORME O VALOR COBRADO POR HORA PELO RESPONSÁVEL DO EVENTO:");
	custor = ler.nextInt();
	
	System.out.println("INFORMAÇÕES SOBRE AS PALESTRAS");
	
	System.out.println("INFORME O NOME DO PALESTRANTE 1 DO EVENTO:");
	palestrante1 = ler.nextLine();
	
	System.out.println("INFORME O TELEFONE DE CONTATO DO PALESTRANTE 1:");
	contato1 = ler.nextLine();
		
	System.out.println("QUANDO SE INICIA A PALESTRA 1?");
	start1 = ler.nextLine();
	
	System.out.println("QUANDO SE ENCERRA A PALESTRA 1?");
	end1 = ler.nextLine();
	
	System.out.println("INFORME O VALOR COBRADO POR HORA PELO PALESTRANTE 1:");
	custop1 = ler.nextInt();
	
	}

}
