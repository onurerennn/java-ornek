
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Scanner giriş = new Scanner(System.in);
	System.out.println("yarıçapı giriniz = ");
	final double PI = 3.14;
	double yarıçap = giriş.nextDouble();
	double çevre = 2*PI*yarıçap;
	System.out.println(çevre);
	}
}
