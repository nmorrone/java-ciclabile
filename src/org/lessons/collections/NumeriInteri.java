package org.lessons.collections;

public class NumeriInteri {

	public int[] numeriInteri;
	
	private int controllo;

	
	//costruttore con array come parametro in istanza
	NumeriInteri(int[] a) {

		this.numeriInteri = a;
		
		this.controllo = 0;
	}
	
	//metodo per ciclare intero array (Super Ciclo For)
	public void cicloArray() {
		for (int valore : numeriInteri) {
			
			System.out.println(valore);
		}
	}
	
	//metodo per aggiungere elemento all'array
	public void aggiungiNumero (int a) {
		
		int [] arrayProvvisorio =  new int[numeriInteri.length + 1];
		System.arraycopy(numeriInteri, 0, arrayProvvisorio, 0, numeriInteri.length);
		arrayProvvisorio[numeriInteri.length] = a;
		
		numeriInteri = arrayProvvisorio;
	}
	
	
	//verificare elemento successivo
	public int getElementoSuccessivo() {
		
		if (haAncoraElementi()) {
			
			return numeriInteri[controllo++];
		}
		
		else {
			throw new IllegalStateException("Non ci sono più elementi");
		}
	}
	
	
	public boolean haAncoraElementi() {
		
		return controllo < numeriInteri.length;
	}
	
	
	//test metodi e costruttore
	public static void main(String[] args) {

		int[] arrayNumeri = { 15, 22, 37, 41, 50, 64, 73, 88, 95 };

		NumeriInteri elenco1 = new NumeriInteri(arrayNumeri);
		
		//testo metodo ciclo
		elenco1.cicloArray();
		
		//testo metodo aggiunta
		elenco1.aggiungiNumero(78);
		
		elenco1.cicloArray();
		
		//testo elemento successivo
		while(elenco1.haAncoraElementi()) {
			
			System.out.println("Elemento successivo : " + elenco1.getElementoSuccessivo());
			
		}

	}

}