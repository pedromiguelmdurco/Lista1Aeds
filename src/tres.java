import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		//declarando variaveis
		Scanner entrada = new Scanner(System.in);
		
		int ano, anoA = 2021, ida;
		char opcao ;
		
		//coletando valores
		System.out.print("Digite o ano que você nasceu: ");
		ano = entrada.nextInt();
		
		ida = anoA - ano;
		
		System.out.print("Você ja fez aniversario esse ano?(S/N): ");
		opcao = entrada.next().charAt(0);
	
		//condicao
		if(opcao == 's' || opcao == 'S')
		{
			
			//Conferindo se pode ter a carta de hab
			if(ida >= 18)
			{
				System.out.println("Sua idade é: "+ ida);
				System.out.print("Você já pode ter Carta de Habilitação");
			}
			else
			{
				System.out.println("Sua idade é: "+ ida);
				System.out.print("Você não pode ter ainda Carta de Habilitação");
			}
			
		}
		else
		{
			ida -= 1;
			if(ida >= 18)
			{
				System.out.println("Sua idade é: "+ ida);
				System.out.print("Você já pode ter Carta de Habilitação");
			}
			else
			{
				System.out.println("Sua idade é: "+ ida);
				System.out.print("Você não pode ter ainda Carta de Habilitação");
			}
			
		}
		
		
		entrada.close();

	}

}
