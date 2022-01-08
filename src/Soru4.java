import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Bir tam sayý giriniz:");
		int sayi = giris.nextInt();

		if (sayi % 5 == 0)
			System.out.println("Hi five!");

		else if (sayi % 2 == 0)
			System.out.println("Hi even!");
		else {
			System.out.println("2'ye veya 5'e bölünmez sayý girdiniz!");
		}

	}

}
