import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		//declarando variaveis
		Scanner entrada = new Scanner(System.in);
		
		int ano, anoA = 2021, ida;
		char opcao ;
		
		//coletando valores
		System.out.print("Digite o ano que voc� nasceu: ");
		ano = entrada.nextInt();
		
		ida = anoA - ano;
		
		System.out.print("Voc� ja fez aniversario esse ano?(S/N): ");
		opcao = entrada.next().charAt(0);
	
		//condicao
		if(opcao == 's' || opcao == 'S')
		{
			
			//Conferindo se pode ter a carta de hab
			if(ida >= 18)
			{
				System.out.println("Sua idade �: "+ ida);
				System.out.print("Voc� j� pode ter Carta de Habilita��o");
			}
			else
			{
				System.out.println("Sua idade �: "+ ida);
				System.out.print("Voc� n�o pode ter ainda Carta de Habilita��o");
			}
			
		}
		else
		{
			ida -= 1;
			if(ida >= 18)
			{
				System.out.println("Sua idade �: "+ ida);
				System.out.print("Voc� j� pode ter Carta de Habilita��o");
			}
			else
			{
				System.out.println("Sua idade �: "+ ida);
				System.out.print("Voc� n�o pode ter ainda Carta de Habilita��o");
			}
			
		}
		
		
		entrada.close();

	}

}
