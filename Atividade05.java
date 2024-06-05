package Vetor;

import java.util.ArrayList;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		ArrayList<String> listaIngred = new ArrayList<String>();
		Scanner Ler = new Scanner(System.in);

		listaIngred.add("açai");
		listaIngred.add("paçoca");
		listaIngred.add("morango");
		listaIngred.add("amenduim torrado");
		listaIngred.add("leite condensado");
		listaIngred.add("leite em pó");
		listaIngred.add("nutella");
		listaIngred.add("granola");
		listaIngred.add("chocolate");
		listaIngred.add("cobertura");
		System.out.println(listaIngred);

		System.out.println("[1]O que deseja adicionar?");

		System.out.println("[2]O que deseja retirar?");

		System.out.println("[3]irá manter os ingredientes?");

		int i = Ler.nextInt();

		if (i == 1) {
			System.out.println("o que deseja adicionar?");
			listaIngred.add(Ler.next());
			System.out.println(listaIngred);

		}
		else if(i == 2) {
			System.out.println("[2]O que deseja retirar?");
		listaIngred.remove(Ler.nextInt());
		System.out.println(listaIngred);
		}
		else {
			System.out.println("lista:" + listaIngred );
		}

	}
	

}
