package Vetor;

import java.util.ArrayList;

public class Atividade02 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		int soma = 0;
		numeros.add(10);
		numeros.add(-20);
		numeros.add(32);
		numeros.add(-46);
		numeros.add(58);

		for (int numero : numeros) {
			if (numero < 0) {
				soma += numero;
			}
		}

		System.out.println(soma);

	}

}
