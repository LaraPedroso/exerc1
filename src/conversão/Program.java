package conversão;

import java.util.Locale;
import java.util.Scanner;

import ult.Conv;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conv conversao = new Conv();
		
		
		System.out.println("qual é o preço em dólar?");
		conversao.dolar = sc.nextDouble();

		
		System.out.println("quantos dólares serão comprados?");
		conversao.quantiaDolar = sc.nextDouble();
		
		System.out.println("valor a ser pago em reais  " + conversao.currencyConverter());
		
	}

}
