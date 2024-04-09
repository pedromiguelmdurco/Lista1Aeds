import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		
		//declaraçao de variaveis
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2; 
		
		//PEgando valores
		System.out.print("Digite um número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Agora digite outro número: ");
		num2 = entrada.nextInt();
		
		//Condiçao
		if(num1 > num2)
		{
			System.out.println("O maior número é: "+ num1);
		}
		else
		{
			System.out.println("O maior número é: "+ num2);
		}
		
		
		
		entrada.close();

	}

}
