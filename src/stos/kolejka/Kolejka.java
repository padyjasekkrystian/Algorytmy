package stos.kolejka;

import java.util.*;

public class Kolejka {

	private List<Integer> kolejka = new ArrayList<>();

	public Kolejka(int a, int b, int c) {
		kolejka.addAll(Arrays.asList(a, b, c));
	}

	public List<Integer> getKolejka() {
		return kolejka;
	}

	/*
	 * Kolejka, (FIFO) kiosk x x x x x x x
	 * 
	 * In(n) - operacja wstawienia elementu n na konice kolejki (po prawej)
	 * 
	 * Out() - operacja usuniecia elemntu z lewej strony
	 * 
	 * First() - podejrzenie elementu z lewej strony
	 * 
	 * size() zwraca rozmiar
	 * 
	 * isEmpty() true jesli kolejka jest pusta
	 * 
	 * reverse() odwraca kolejnosc elementow w kolejce
	 */

	public void in(int element) {
		kolejka.add(element);
	}

	public void out() {
		kolejka.remove(kolejka.size() - 1);
	}

	public Integer first() {
		return kolejka.get(0);
	}

	public Integer size() {
		return kolejka.size();
	}

	public boolean isEmpty() {
		return kolejka.isEmpty();
	}

	public void reverse() {
		int zmienna;
		for (int i = 0; i < kolejka.size() / 2; i++) {
			zmienna = kolejka.get(i);
			kolejka.set(i, kolejka.get(kolejka.size() - 1 - i));
			kolejka.set(kolejka.size() - 1 - i, zmienna);
		}
	}

	public String toString() {
		return kolejka.toString();
	}

}
