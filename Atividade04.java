package Vetor;

import java.util.ArrayList;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {

		ArrayList<String> carros = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		int i =0 ;
		carros.add("HILUX");
		carros.add("S-10");
		carros.add("AMAROK");
		carros.add("DODG RAM 2500");
		carros.add("SILVERADO");
		carros.add("TORO");
		carros.add("ORICH");
		carros.add("SAVEIRO");
		carros.add("MONTANA");
		carros.add("STRADA");

		System.out.println(carros);
		System.out.println("Me informe o carro que gostaria de ver:");
		i = ler.nextInt();
		System.out.println(carros.get(i));



	}

}
