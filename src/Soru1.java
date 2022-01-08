
import java.util.Scanner;

public class Soru1 {
	
	public static void main(String[] args) {
		
		float a, h, alan;
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Kenar uzunluðunu giriniz(cm):");
		a = klavye.nextFloat();
		
		System.out.print("Yüksekliði giriniz(cm):");
		h = klavye.nextFloat();
		
		alan = a * h / 2;
		
		System.out.println("Üçgenin alaný:" + alan);
	}
}