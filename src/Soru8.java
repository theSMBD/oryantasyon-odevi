import java.util.Scanner;
public class Soru8 {

	public static void main(String[] args) {
	int yil;
	Scanner oku=new Scanner(System.in);
	System.out.print("Y�l� giriniz");
	yil=oku.nextInt();
	if(yil%4==0)
		System.out.print("Art�k y�ld�r!");
	else
		System.out.print("Art�k y�l de�ildir!");
	

	}

}
