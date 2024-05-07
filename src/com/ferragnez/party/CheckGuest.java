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

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		//creare e inizializzare array lista invitat
		String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
				
		//chiedere all'utente come si chiama

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Come ti chiami? ");
			String nome = input.nextLine();
			System.out.println("Ti chiami " + nome);
			
			//verificare che l'utente sia in lista
			System.out.println("Stiamo controllando se sei in lista...");
			
			boolean trovato = false;
			
			for(int i = 0; i < invitati.length; i++) {
				
				 if(invitati[i].equals(nome)) {
					 trovato = true;
				 
				 }
			}
			
			if (trovato) {
				 System.out.println("Ok sei in lista, entra pure e divertiti.");
			}
			
			else {
				 System.out.println("Tornatene da dove sei venuto!");
			}
		}
		
	}

}
