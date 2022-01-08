import java.util.Scanner;
public class Soru8 {

	public static void main(String[] args) {
	int yil;
	Scanner oku=new Scanner(System.in);
	System.out.print("Yýlý giriniz");
	yil=oku.nextInt();
	if(yil%4==0)
		System.out.print("Artýk yýldýr!");
	else
		System.out.print("Artýk yýl deðildir!");
	

	}

}
