package stos.kolejka;

public class Main {

	public static void main(String[] args) {
		
		Kolejka kolejka = new Kolejka(1, 2, 3);
		kolejka.reverse();
		System.out.println(kolejka);
		kolejka.in(4);
		System.out.println(kolejka);
		kolejka.out();
		System.out.println(kolejka);
		System.out.println("Pierwszy element kolejki " + kolejka.first());
		System.out.println("Rozmiar kolejki " + kolejka.size());
		System.out.println("Kolejka jest pusta " + kolejka.isEmpty());
		System.out.println();
		
		Stos stos = new Stos(1, 2, 3);
		stos.reverse();
		System.out.println(stos);
		stos.push(4);
		System.out.println(stos);
		stos.pop();
		System.out.println(stos);
		System.out.println("Ostatni element stosu " + stos.top());
		System.out.println("Rozmiar stosu " + stos.size());
		System.out.println("Stos jest pusty " + stos.isEmpty());

	}

}
