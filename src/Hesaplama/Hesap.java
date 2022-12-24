package Hesaplama;

import java.util.Scanner;

public class Hesap {

	private static int islem;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		
		String islemler="1.Islem Cikarma \n"
				+"2.Islem Toplama\n"
				+"3.Islem Bolme\n"
				+"4.Islem Carppma";
		System.out.println(islemler);
		
		System.out.println("Islem Seciniz:");
		String islem=scan.nextLine();
		
	
		
		int a;
		int b;
		
		switch (islem) {
		
		case "1" :
		System.out.print("Birinci Sayi: " );
				
		 a=scan.nextInt();
		
		System.out.println("Ikinci Sayi: ");
		 b=scan.nextInt();
		
		System.out.println("Cikan:" +(a-b));
			
		
		case "2":
			System.out.println("Birinci sayi: ");
			 a=scan.nextInt();
			
			System.out.println("Ikinci Sayi: ");
			 b=scan.nextInt();
			System.out.println("Toplam: " + (a+b));
		
		case "3":
		System.out.println("Birinci sayi: ");
		 a=scan.nextInt();
		
		System.out.println("Ikinci Sayi: ");
		 b=scan.nextInt();
		System.out.println("Bolum: " + ((double)a/b));
		
		
		case"4":
			
		
			System.out.println("Birinci sayi: ");
			 a=scan.nextInt();
			
			System.out.println("Ikinci Sayi: ");
			 b=scan.nextInt();
			System.out.println("Carpım: " + (a*b));
		
		break;
		default:
			System.out.println("Isleminiz Gecersiz");
			
			
			
		}
		

		
	}

}
