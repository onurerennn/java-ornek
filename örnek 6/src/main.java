import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("sayı giriniz = ");
		int sayı = giriş.nextInt();
		int toplam = 1;
		int j = 0;
		if (sayı >= 0) {
			for (int i = 1; sayı >= i; i++) {
				toplam = toplam * i;
			}
			System.out.println(toplam);
		} else {
			System.out.println("hatalı sayı girdiniz");
		}

	}
}
