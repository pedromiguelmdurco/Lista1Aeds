import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		
		//declarando variaveis
		
		Scanner entrada = new Scanner(System.in);
		
		
		int valor, zero = 0 , posi = 0, nega = 0, cont, porp, porz, porn,contp;//porp = porcentagem positivo --  porz = porcentagem de zeros -- porn =porcentagem negativos
		
		System.out.print("Você quer sua sequência de quantos números?: ");
		cont = entrada.nextInt();
		
		contp = cont;
		
		//repeticao
		//fiquei muito em duvida pois n expecificou o metodo de como queria q eu recolhece a sequencia por isso pergunto logo de cara qual sera o tamanho da sequencia q o usuario deseja fazer
		while(cont > 0)
		{
			System.out.print("Digite um número: ");
			valor = entrada.nextInt();
			
			if(valor == 0)
			{
				zero++;
			}
			else if(valor > 0)
			{
				posi++;
			}
			else
			{
				nega++;
			}
				
			cont--;
		}
		
		//Atividade 7
		porp = (int) (((double)posi/contp)*100);
		porn = (int) (((double)nega/contp)*100);
		porz = (int) (((double)zero/contp)*100);
		
		System.out.println("Numeros positivos "+ porp +"%");
		System.out.println("Numeros negativos "+ porn  +"%");
		System.out.println("Zeros "+ porz +"%");
		
		
		
		entrada.close();

	}

}
