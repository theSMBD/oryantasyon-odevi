import java.util.Scanner;

public class Soru9 {
	public static void main(String[] args) {
		double d, r, g;
		double pi = 3.14;
		
		
		Scanner oku = new Scanner(System.in);
		System.out.print("Açýyý giriniz:");
		d = oku.nextDouble();
		d = d % 360;
		
		r = d * pi / 180;
		g = d * 200 / 180;
		System.out.println("Radyan = " + r);
		System.out.println("Grad = " + g);

	}
}
