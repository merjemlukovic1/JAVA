package Zadaci;
import java.util.Scanner;
public class Samoglasnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Unesite rečenicu: ");
        String recenica = sc.nextLine();
        
        String samoglasnici = "aeiouAEIOU";
        
        int brojsamoglasnika = 0;
        int suglasnici = 0 ;
        
        
        for (int i=0; i<recenica.length();i++) {
        	char c = recenica.charAt(i);
        	if(Character.isLetter(c)) {
        		if(samoglasnici.indexOf(c)!= - 1) {
        		}
        		else {
        			suglasnici = suglasnici + 1;
        			
        		}
        	}
        	
        }
        
        System.out.println(" Ukupan broj samoglasnia je :" + brojsamoglasnika);	
        
        sc.close();

	}

}
