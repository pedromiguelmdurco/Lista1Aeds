import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		
		//declara�ao de variaveis
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2; 
		
		//PEgando valores
		System.out.print("Digite um n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Agora digite outro n�mero: ");
		num2 = entrada.nextInt();
		
		//Condi�ao
		if(num1 > num2)
		{
			System.out.println("O maior n�mero �: "+ num1);
		}
		else
		{
			System.out.println("O maior n�mero �: "+ num2);
		}
		
		
		
		entrada.close();

	}

}
