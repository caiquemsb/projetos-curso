import java.util.Scanner;

public class Eventos {

	public static void main(String[] args) {
	System.out.println("INFORMA��ES DO EVENTO");	
	Scanner ler = new Scanner(System.in);
	String evento, respons�vel, telefone, palestrante1, start1, end1, descri��o1, contato1, palestrante2, start2, end2, descri��o2, contato2 ;
	double custor, custotr, chr, chp1, chp2, custop1, custop2, custotp1, custotp2;
	
	System.out.println("DIGITE O NOME DO EVENTO: ");
	evento = ler.nextLine();
	
	System.out.println("INFORME O NOME DO RESPONS�VEL PELO EVENTO:");
	respons�vel = ler.nextLine();
	
	System.out.println("INFORME O TELEFONE DE CONTATO DO RESPONS�VEL PELO EVENTO:");
	telefone = ler.nextLine();
	
	System.out.println("QUAL A DURA��O EM HORAS DO EVENTO?");
	chr = ler.nextInt();
	
	System.out.println("INFORME O VALOR COBRADO POR HORA PELO RESPONS�VEL DO EVENTO:");
	custor = ler.nextInt();
	
	System.out.println("INFORMA��ES SOBRE AS PALESTRAS");
	
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
