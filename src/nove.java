import java.util.Scanner;

public class nove {

	public static void main(String[] args) {
		//declaracao de variaveis
		
		Scanner entrada = new Scanner(System.in);
		
		double salario=0, medsal, medfil, totalsal=0, maxsal=0, porc, contp=0;
		int filhos, cidadoes, totalf=0; 
		// aq eu deixei filhos e cidadoes em int pq geralmente � numeros inteiros 
		System.out.print("Quantos habitantes voc� quer colocar?: ");
		cidadoes = entrada.nextInt();
		
		medfil = cidadoes;
		
		while(cidadoes>0)
		{
			System.out.print("Quantos filhos voc� tem: ");
			filhos = entrada.nextInt();
			
			totalf += filhos;
			
			System.out.print("Quanto � o seu salario: R$");
			salario = entrada.nextDouble();
			
			totalsal += salario;
			
			if(maxsal < salario)
			{
				maxsal = salario;
			}
			
			if(salario <= 100) 
			{
				contp++;
			}
			
			if(salario < 0) {
				cidadoes = 0;
			}
			else 
			{
				cidadoes--;
			}
			
		}
		
		//calculo da media 
		
		if(salario < 0) 
		{
			System.out.print("Digite um salario que n�o seja negativo");
		}
		else
		{ // criei a medfil para fazer so a media dos filhos mas pensei em uma forma q conseguiria usar para todos antes do valor dela se alterar
			porc = (contp/medfil)*100;
		
			medsal = totalsal/medfil;
		
			medfil = totalf/medfil;
		
		
			System.out.println("A media do salario �: R$"+ medsal);
		
			System.out.println("A media de filhos �: "+ medfil);
		
			System.out.println("O salario mais alto �: R$"+maxsal);
		
			System.out.printf("Percentual de pessoas com salario ate R$100: %.2f\n", porc);
		}
		
		
		
		entrada.close();

	}

}
