import java.util.Scanner;

public class Soru6 {
	public static void main(String[] args) {
		// 1. �ki tane random tam say� �ret
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);

		// 2. sayi1<sayi2 ise sayi1 ve sayi2 yi yer de�i�tir//
		if (sayi1 < sayi2) {
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
		}

		// 3. Kullan�c�ya sor sayi1-sayi2 sonucu nedir//
		System.out.print(sayi1 + " - " + sayi2 + " nedir?");
		Scanner giris = new Scanner(System.in);
		int cevap = giris.nextInt();

		// 4. Cevab� de�erlendir ve sonucu g�ster//
		if (sayi1 - sayi2 == cevap)
			System.out.println("Sonu� do�ru,TEBR�KLER!");
		else {
			System.out.println("Cevab�n�z yanl��!");
			System.out.println(sayi1 + " - " + sayi2 + " i�leminin sonucu " + cevap + " olmal�d�r!");

		}
	}

}
