
import java.util.Scanner;

public class Soru7 {
	public static void main(String[] args) {
		int sayi, kere = 0, tahmin;
		sayi = (int) (Math.random() * 100) + 1;
		do {
			Scanner oku = new Scanner(System.in);
			kere++;
			System.out.println("Tahmininiz");
			tahmin = oku.nextInt();
			if (tahmin > sayi) {
				System.out.println("Küçük Yaz");

			}
			if (tahmin < sayi) {
				System.out.println("Büyük yaz");
			}
		} while (tahmin != sayi);
		System.out.println("Tebrikler!  " + kere + ".adýmda buldunuz");
	}
}
