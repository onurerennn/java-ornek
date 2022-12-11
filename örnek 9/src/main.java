import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("vize notu = ");
		System.out.println("final notu = ");
		int vizenotu = giriş.nextInt();
		int finalnotu = giriş.nextInt();
		double ortalama = (vizenotu * 0.4) + (finalnotu * 0.6);
		System.out.println(ortalama);

	}
}
