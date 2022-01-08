import java.util.Scanner;

public class Soru6 {
	public static void main(String[] args) {
		// 1. İki tane random tam sayı üret
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);

		// 2. sayi1<sayi2 ise sayi1 ve sayi2 yi yer değiştir//
		if (sayi1 < sayi2) {
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
		}

		// 3. Kullanıcıya sor sayi1-sayi2 sonucu nedir//
		System.out.print(sayi1 + " - " + sayi2 + " nedir?");
		Scanner giris = new Scanner(System.in);
		int cevap = giris.nextInt();

		// 4. Cevabı değerlendir ve sonucu göster//
		if (sayi1 - sayi2 == cevap)
			System.out.println("Sonuç doğru,TEBRİKLER!");
		else {
			System.out.println("Cevabınız yanlış!");
			System.out.println(sayi1 + " - " + sayi2 + " işleminin sonucu " + cevap + " olmalıdır!");

		}
	}

}
