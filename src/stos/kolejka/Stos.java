package stos.kolejka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stos {

	private List<Integer> stos = new ArrayList<>();

	public Stos(int a, int b, int c) {
		stos.addAll(Arrays.asList(a, b, c));
	}
	
	/*
	 * Stos, 

		Push(n) - operacja wstawienia elementu n na konice stosu (po prawej)
		
		Pop() - operacja usuniecia elemntu z prawej strony stosu
		
		TOP() - podejrzenie elementu z prawej strony
		
		size() zwraca rozmiar
		
		isEmpty() true jesli stos jest pusty
		
		reverse() odwraca kolejnosc elementow w stosie
	 */
	
	public void push(int element) {
		stos.add(element);
	}
	
	public void pop() {
		stos.remove(stos.size() - 1);
	}
	
	public Integer top() {
		return stos.get(stos.size() - 1);
	}
	
	public Integer size() {
		return stos.size();
	}
	
	public boolean isEmpty() {
		return stos.isEmpty();
	}
	
	public void reverse() {
		Collections.reverse(stos);
	}

	public List<Integer> getStos() {
		return stos;
	}
	
	public String toString() {
		return stos.toString();
	}
}
