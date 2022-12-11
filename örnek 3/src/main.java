import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("1.sayı = ");
		System.out.println("2.sayı = ");
		int sayı1 = giriş.nextInt();
		int sayı2 = giriş.nextInt();
		System.out.println("işleminizi seçin = ");
		System.out.println("1.işlem = toplama");
		System.out.println("2.işlem = çıkarma");
		System.out.println("3.işlem = çarpma");
		System.out.println("4.işlem = bölme");
		int seçim = giriş.nextInt();
		if (seçim == 1) {
			System.out.println(sayı1 + sayı2);

		} else if (seçim == 2) {
			System.out.println(sayı1 - sayı2);
		} else if (seçim == 3) {
			System.out.println(sayı1 * sayı2);
		} else if (seçim == 4) {
			System.out.println(sayı1 / sayı2);
		} else {
			System.out.println("hatalı giriş");
		}
	}
}
