
import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		int a;
		
	 Scanner klavye = new Scanner(System.in);
		
		System.out.print("Bir tam say� giriniz:");
		a = klavye.nextInt();
		
		if (a % 2 == 0)
			System.out.println("��FT");
		
		else
			System.out.println("TEK");

	}

}
