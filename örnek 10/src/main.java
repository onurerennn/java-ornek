import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("yarıçapı giriniz = ");
		double yarıçap = giriş.nextDouble();
		final double PI = 3.14;
		double alan = PI * yarıçap * yarıçap;
		System.out.println(alan);
	}
}
