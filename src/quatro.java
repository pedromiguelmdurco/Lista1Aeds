import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
		
		//declarando a variaveis
		
		Scanner entrada = new Scanner(System.in);
		
		
		double nota;
		
		System.out.print("Digite sua nota: ");
		nota = entrada.nextDouble();
		//peguei uma base boa na aula para isso e add o nota < 0 para n ter erros
		//condicao
		if(nota < 0)
		{
			System.out.print("Valor invalido");
		}
		else if(nota < 5)
		{
			System.out.print("Insatisfatório");
		}
		else if(nota >= 5 && nota < 7)
		{
			System.out.print("Regular");
		}
		else if(nota >= 7 && nota < 8)
		{
			System.out.print("Bom");
		}
		else
		{
			System.out.print("Ótimo");
		}
		
		entrada.close();
	}

}
