import java.util.Scanner;

public class durchschnittUngeraderZahlen {

	public static void main(String[] args) {

		double a, b, c;

		Scanner in = new Scanner(System.in);

		//Sayilari okutmak icin
		System.out.println("Lütfen birinci sayiyi girin: ");
		a = in.nextInt();

		System.out.println("Lütfen ikinci sayiyi girin: ");
		b = in.nextInt();

		//tek sayilari basmasi icin
		if (a % 2 == 1) {

			System.out.println("tek sayi: " + a);
		}

		else if (b % 2 == 1) {

			System.out.println("tek sayi: " + b);
		}
		
		//sayilarin ortalamasini basmasi icin
		c = (a + b) / 2;

		System.out.println("sayilarin ortalamasi: " + c);

	}

}
