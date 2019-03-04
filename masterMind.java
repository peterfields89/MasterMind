import java.util.Random;
import java.util.Scanner;

public class masterMind {
	public static void main(String[] args) {
		System.out.println("Welkom bij Mastermind :)");	
		Speler s = new Speler(); 
		s.spelen();
		hallo();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {
		System.out.println(hallo());
		String bla = scan.nextLine();
		if (bla == bla) {
			System.out.println("Heel goed, je hebt alle letters goed geraden");
			return;
		}
		else {
			System.out.println("Helaas, de letters zijn niet goed");
			return; 
			}
		}
	}
	static char hallo() {
		Random random = new Random();	
		int bla = random.nextInt(6);
		if (bla == 0) {
			return 'a';
				}
		if (bla == 1) {
			return 'b';
				}
		if (bla == 2) {
			return 'c';
				}
		if (bla == 3) {
			return 'd';
				}
		if (bla == 4) {
			return 'e';
				}
		return 'f';
	}
}
class Speler{
	static void spelen(){
	System.out.println("Wat is je naam?");
	Scanner scan = new Scanner(System.in);
	String naamIn = scan.nextLine();
	System.out.println("Hallo " + naamIn +", laten we beginnen met spelen!");
	}
}














//char letter[]= {97, 98, 99, 100, 101, 102};
//System.out.println(letter);
//Random random = new Random();
