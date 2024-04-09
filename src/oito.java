import java.util.Scanner;

public class oito {

	public static void main(String[] args) {
		//declaracao variaveis
		
		Scanner entrada = new Scanner(System.in);

		int n,valor, num;
		double e, fat;
		
		System.out.print("Digite um número: ");
		n = entrada.nextInt();
		
		e = 1;
		num = 1;
		while(num <= n) 
		{
			
			fat = 1;
			for(valor = num; valor > 1; valor--)
			{
				
				fat = (fat *valor);
				System.out.println(e);
		
			}
			e = e + 1/fat;
			num++;
			
		}
		
		
		System.out.printf("O valor da expressão é %.6f\n", e);
	
		entrada.close();
	}

	
	
}
