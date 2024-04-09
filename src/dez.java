import java.util.Scanner;

public class dez {

	public static void main(String[] args) {
		//declarando variaveis
		Scanner entrada = new Scanner(System.in);
		
		 
		double conta = 0 , conta2 = 0, n, cont;
		//coletando valores
		System.out.print("Digite um valor: ");
		n = entrada.nextInt();
		
		cont = 0;
		
		
		// fiz um while para ficar repetindo toda vez q o numero n chegar no do q o usuario informou fazendo repetir e alterar o valor de divisão
		while(cont <= n)
		{
			
			if(cont > 0) //botei esse if pois estava resultando em um infinito e n s
			{
				conta = 1/cont;
				
				conta2 += conta ;
				
				System.out.println(conta);
			}
			
			cont++;
		}
		
		System.out.println("Resultado "+ conta2);
		
		entrada.close();

	}

}
