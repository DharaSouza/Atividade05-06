package Vetor;

import java.util.ArrayList;

public class Atividade03 {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList<String>();

		
		frutas.add("melancia");
		frutas.add("banana");
		frutas.add("uva");
		frutas.add("bergamota");
		frutas.add("pitaya");
		frutas.add("caqui");
		frutas.add("laranja");
		frutas.add("abacaxi");
		frutas.add("pesego");
		frutas.add("jabuticaba");
		System.out.println(frutas);
		
		frutas.remove(5);
		
		frutas.remove(3);
		
		frutas.remove(7);
	
		frutas.remove(4);
		
		frutas.remove(1);
		System.out.println(frutas);
		System.out.println(frutas.size());
		
	}

}
