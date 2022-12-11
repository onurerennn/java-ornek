
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("celcius değeri girin = ");
		int celcius = giriş.nextInt();
		final double kelvin = celcius+273;
		System.out.println(kelvin);

	}
}