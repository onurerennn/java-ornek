import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("sayı giriniz = ");
		int sayı = giriş.nextInt();
		if (sayı > 0) {
			System.out.println("pozitif");

		} else if (sayı == 0) {
			System.out.println("pozitif veya negatif değil");
		} else {
			System.out.println("negatif");
		}

	}
}