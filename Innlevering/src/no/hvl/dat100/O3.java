package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {
	public static void main(String[] args) {
	String Tall = showInputDialog("Tall"); 
	
	int n = parseInt (Tall);
	
	int N = 1;
	
	for (int i = 1; i <= n; i++) {
		
		N = i * N; 
		if (i == n) {
		System.out.print(i);
		} else {
			System.out.print(i + "*");
		}
	}
	System.out.print(" = " +n +  "! = " + N);
	
	}

}


