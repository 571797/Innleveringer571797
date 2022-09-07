package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
		String Poeng = showInputDialog("Poeng"); 
		
		int p = parseInt (Poeng);

		int [] P = {0, 40, 50, 60, 80, 90, 100}; 
		String [] K = {"F", "E", "D", "C", "B", "A"}; 
		
		if ((p >= P[0]) && (p < P[1])) {
			
			System.out.println(K[0]);
		} else {
			if ((p >= P[1]) && (p < P[2])) {
				
				System.out.println(K[1]);
			} else {
				if ((p >= P[2]) && (p < P[3])) {
					
					System.out.println(K[2]);
				} else {
					if ((p >= P[3]) && (p < P[4])) {
						
						System.out.println(K[3]);
					} else {
						if ((p >= P[4]) && (p < P[5])) {
							
							System.out.println(K[4]);
						} else {
							if ((p >= P[5]) && (p <= P[6])) {
								
								System.out.println(K[5]);
							} else {
								if ((p < P[0]) || (p > P[6])) {
									
									System.out.println("ERROR Prøv igjen");
									i = i-1; 
								
								}
								
						}
							
			}
				
		}
		
	}

}}}
		

}

}


