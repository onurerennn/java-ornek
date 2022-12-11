import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Scanner giriş = new Scanner(System.in);
	System.out.println("1.sayı = ");
	System.out.println("2.sayı = ");
	double sayı1 = giriş.nextDouble();
	double sayı2 = giriş.nextDouble();
	double ortalama = (sayı1+sayı2)/2;
			System.out.println(ortalama);
	}
}
