import java.util.Scanner;

public class Soru5 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("1-100 öðrenci puanýný giriniz:");
		
		double puan = giris.nextDouble();
		
		if (puan >= 90.0)
			System.out.print("Harf notunuz:A");
		
		else if (puan >= 80.0)
			System.out.print("Harf notunuz:B");
		
		else if (puan >= 70.0)
			System.out.print("Harf notunuz:C");
		
		else if (puan >= 60.0)
			System.out.print("Harf notunuz:D");
		
		else
			System.out.print("Harf notunuz:F");

	}

}
