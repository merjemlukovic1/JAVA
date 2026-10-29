package Zadaci;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Unesi recenicu");

String recenica = sc.nextLine(); 


StringBuilder sb  = new StringBuilder(recenica);
String obrnuto = sb.reverse().toString(); 

if (recenica.equalsIgnoreCase(obrnuto)) {
	
	System.out.println("Jeste palindrom");
}
else {
	System.out.println("nije palindrom");
	
	sc.close();
}

	}

}
