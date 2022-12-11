import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("sayı giriniz = ");
		int sayı = giriş.nextInt();
		if (sayı % 2 == 0) {
			System.out.println("sayı çifttir");
		} else {
			System.out.println("sayı tektir");
		}

	}
}
