package Zadaci;
import java.util.Scanner;
public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("unesi recenicu");
		
		String recenica = sc.nextLine().trim();// .trim nam mice sa pocetka i sa kraja space
		
		String[]rijeci = recenica.split("\\s+");
		System.out.println("Ukupan broj rijeci je:"+ rijeci.length);
		
		sc.close();
			

	}

}
