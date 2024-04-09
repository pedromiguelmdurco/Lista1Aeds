import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		
		//DEclarando variaveis
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, conta;
		
		System.out.print("Digite dois valores: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		//matematica
		
		conta = num1 + num2;
		
		//condicao
		if(conta >= 10)
		{
			conta += 5;
			System.out.println("O resultado é: " + conta);
		}
		else
		{
			conta += 7;
			System.out.println("O resultado é: " + conta);
		}
		
		
		entrada.close();

	}

}
