package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Trinnskatt og skattesatser
		
		double[] lønn = {190349, 267899, 643799, 969199, 1999999}; 
		double[] skatt = {0, 0.017, 0.04, 0.134, 0.164, 0.174}; 
		
		//lønn input 
		
		String YLønn = showInputDialog("Lønn"); 
		
		double xlønn = parseDouble (YLønn);
	
		
		//HJELPEBEREGNINGER
		
		//Dette er beregning av skatten en betaler i øverste nivået
		
		double trinn0 = xlønn*skatt[0]; 
		double trinn1 = (xlønn-lønn[0])*skatt[1]; 
		double trinn2 = (xlønn-lønn[1])*skatt[2]; 
		double trinn3 = (xlønn-lønn[2])*skatt[3]; 
		double trinn4 = (xlønn-lønn[3])*skatt[4]; 
		double trinn5 = (xlønn-lønn[4]-1)*skatt[5];

		
		// dette er beregning av skatten en betaler i de nivåene man har passert 
		double trinn0x = lønn[0]*skatt[0];
		double trinn1x = (lønn[1]-1-lønn[0])*skatt[1]; 
		double trinn2x = (lønn[2]-1-lønn[1])*skatt[2]; 
		double trinn3x = (lønn[3]-1-lønn[2])*skatt[3]; 
		double trinn4x = (lønn[4]-1-lønn[3])*skatt[4]; 



		// dette er total skatt en betaler (trinnene en har passert + øverste trinn)
		double total5 = trinn5 + trinn4x + trinn3x + trinn2x + trinn1x + trinn0x; 
		double total4 = trinn4 + trinn3x + trinn2x + trinn1x+ trinn0x; 	
		double total3 = trinn3 + trinn2x + trinn1x + trinn0x; 
		double total2 = trinn2 + trinn1x + trinn0x;
		double total1 = trinn1 + trinn0x;
		double total0 = trinn0; 
		
		
		//Output med alle trinn og total + lønn
			if (xlønn >= lønn[4]) {
				String utTxt = 
						
						
						"trinn(5) = " + trinn5
						+"\ntrinn(4) = " + trinn4x
						+"\ntrinn(3) = " + trinn3x
						+"\ntrinn(2) = " + trinn2x
						+"\ntrinn(1) = " + trinn1x
						+"\ntrinn(0) = " + trinn0x
						+"\nTotal skatt = " + total5
						+"\nDin lønn er" + xlønn
						; 

				showMessageDialog(null,utTxt); 
		} else {
			if (xlønn >= lønn[3]) {
				String utTxt = 

						"trinn(4) = " + trinn4
						+"\ntrinn(3) = " + trinn3x
						+"\ntrinn(2) = " + trinn2x
						+"\ntrinn(1) = " + trinn1x
						+"\ntrinn(0) = " + trinn0x
						+"\nTotal skatt = " + total4
						+"\nDin lønn er " + xlønn
						; 
		

				showMessageDialog(null,utTxt); 
				

		} else {
			if (xlønn >= lønn[2]) {
				String utTxt = 

						"trinn(3) = " + trinn3
						+"\ntrinn(2) = " + trinn2x
						+"\ntrinn(1) = " + trinn1x
						+"\ntrinn(0) = " + trinn0x
						+"\nTotal skatt = " + total3
						+"\nDin lønn er " + xlønn
						; 
		

				showMessageDialog(null,utTxt); 
		} else {
			if (xlønn >= lønn[1]) {
				String utTxt = 

						"trinn(2) = " + trinn2
						+"\ntrinn(1) = " + trinn1x
						+"\ntrinn(0) = " + trinn0x
						+"\nTotal skatt = " + total2
						+"\nDin lønn er " + xlønn
						; 

				showMessageDialog(null,utTxt); 
		} else {
			if (xlønn >= lønn[0]) {
				String utTxt = 

						"trinn(1) = " + trinn1
						+"\ntrinn(0) = " + trinn0x
						+"\nTotal skatt = " + total1
						+"\nDin lønn er " + xlønn
						; 

				showMessageDialog(null,utTxt); 
		
		
		
		} else {
			if (xlønn < lønn[0]) {
				String utTxt = 
						"trinn(0) = " +trinn0
						+"\nTotal skatt" +total0
						+"\nDin lønn er" + xlønn
						; 
				
				showMessageDialog(null,utTxt); 
		}}}}}}
	}
}



