import java.util.Scanner;

public class onze {

	public static void main(String[] args) {
		//declarando variaveis 
		Scanner entrada = new Scanner(System.in);
		
		int votos, can1=0, can2=0, can3=0, can4=0, bran=0, nul=0, cont = 1;
		
		System.out.println("Digite os votos quando tiver acabado digite 7");
		System.out.println("Candidatos:1,2,3,4 Nulo:5 Branco:6");
		
		//estrutura de repetição
		//escolhi o while pois acho q nessa situaçao de loop ele se encaixaria melhor
		while(cont == 1)
		{
			System.out.print("Digite o Codigo do voto: ");
			votos = entrada.nextInt();
			
			switch(votos)
			{
				case 1:
					can1++;
					break;
					
				case 2: 
					can2++;
					break;
					
				case 3: 
					can3++;
					break;
					
				case 4: 
					can4++;
					break;
					
				case 5: 
					nul++;
					break;
					
				case 6: 
					bran++;
					break;
					
				case 7: 
					cont++;
					break;
					
				default:
					System.out.println("Digite alguma das opções");
			
			}//switch
			
		}
		
		System.out.println("Números de votos");
		System.out.println("Candidato1: "+can1);
		System.out.println("Candidato2: "+can2);
		System.out.println("Candidato3: "+can3);
		System.out.println("Candidato4: "+can4);
		System.out.println("Nulos: "+nul);
		System.out.println("Em branco: "+bran);
		
		entrada.close();

	}

}
