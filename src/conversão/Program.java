package convers�o;

import java.util.Locale;
import java.util.Scanner;

import ult.Conv;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conv conversao = new Conv();
		
		
		System.out.println("qual � o pre�o em d�lar?");
		conversao.dolar = sc.nextDouble();

		
		System.out.println("quantos d�lares ser�o comprados?");
		conversao.quantiaDolar = sc.nextDouble();
		
		System.out.println("valor a ser pago em reais  " + conversao.currencyConverter());
		
	}

}
