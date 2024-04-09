import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		
		//declarando variaveis
		Scanner entrada = new Scanner(System.in);
		
		double valor, conta, ap = 75, contap, contat;
		//escolhi double pois e relacionado a dinheiro e decimais encaixa bem em centavos
		
		System.out.print("Digite o valor da diaria do hotel: ");
		valor = entrada.nextDouble();
		
		//contas
		
		conta = valor * 0.75;
		
		//conta = valor - conta; //Aq eu deixei comentado pq parei para pensar se deu desconto de 25% era so fazer a conta mutiplicando 75% pq serio o preco total
		
		contap = (ap * 0.8) * conta;
		
		contat = (ap * 0.5)* valor;
		
		//imprimindo resultado
		
		System.out.println("a)O valor da diaria com promoção é: R$"+conta);
		
		System.out.println("b)O valor arrecadado com ocupação de 80% + a promoção é de: R$"+ contap);
		
		System.out.println("c)O valor arrecadado com ocupação de 50% sem a promoção: R$"+ contat);
		
		System.out.println("d)A diferença entre esses valores é de: R$"+(contap-contat));
		
		entrada.close();

	}

}
