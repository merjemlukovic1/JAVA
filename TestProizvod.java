package Zadaci;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProizvod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Garderoba g1 = new Garderoba("majica", 25352, "Crna Goraa", 2026, 2.5, "kasmir", "zimska");
		HemijskiProizvodi h1 = new HemijskiProizvodi("prasal", 51515, "Crna Gora", 2026, 10.0, 10.0, false);
		Hrana h2 = new Hrana("banane", 01511521, "Srbija", 2026, 20.0, 200, null);


		ArrayList<Proizvod> lista = new ArrayList<Proizvod>();
		lista.add(g1);
		lista.add(h1);
		lista.add(h2);

		for (Proizvod p : lista) {
			System.out.println(p);
		}


		for (Proizvod p : lista) {
			p.izrcunajCijenu();
		}

		System.out.println("********");

		for (Proizvod p : lista) {
			System.out.println(p);
		}



		sc.close();





			}


	}


