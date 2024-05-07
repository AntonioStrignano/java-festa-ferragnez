/*
Nel programma bisogna: creare e inizializzare l’array contenente i nomi degli invitati chiedere
all’utente come si chiama e  verificare che il nome sia presente nella lista; lasciarlo entrare
o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare
lo stesso programma usando il ciclo while, e viceversa Buon lavoro e buon weekend!
Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio,
 Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
*/

package com.ferragnez.party;

import java.util.Iterator;
import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		//creare e inizializzare array lista invitati
		String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
		};
				
		//chiedere all'utente come si chiama

		Scanner input = new Scanner(System.in);
		System.out.println("Come ti chiami? ");
		String nome = input.nextLine();
		
		//verificare che l'utente sia in lista
		System.out.println("Stiamo controllando se sei in lista...");
		
		for (int i = 0; i < invitati.length; i++) {
			
			System.out.println(invitati[i]);
			/*
			 * if (nome == i) { }System.out.println("OK, puoi entrare.");
			 */
		}
		
		
		
	}

}
