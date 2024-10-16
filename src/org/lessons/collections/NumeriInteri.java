package org.lessons.collections;

public class NumeriInteri {

	public int[] numeriInteri;

	
	//costruttore con array come parametro in istanza
	NumeriInteri(int[] a) {

		this.numeriInteri = a;
	}
	
	//metodo per ciclare intero array (Super Ciclo For)
	public void cicloArray() {
		
		for (int valore : numeriInteri) {
			
			System.out.println(valore);
		}
	}
	
	
	
	
	public static void main(String[] args) {

		int[] arrayNumeri = { 15, 22, 37, 41, 50, 64, 73, 88, 95 };

		NumeriInteri elenco1 = new NumeriInteri(arrayNumeri);
		
		elenco1.cicloArray();

	}

}