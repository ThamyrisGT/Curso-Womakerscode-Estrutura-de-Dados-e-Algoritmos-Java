package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer5Desafio1 {

	public static void main(String[] args) {

		imprimeResultado("ADA");

		imprimeResultado("ABCD");

		imprimeResultado("ABCCBA");

		imprimeResultado("Thamyris");
	}

	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " � palindromo? " + testaPalindromo(palavra));
	}

	public static boolean testaPalindromo(String palavra) {

		Pilha<Character> pilha = new Pilha<Character>();

		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}

		// se nao fosse usar pilha, era colocar direto na string concatenando
		String palavraInversa = "";
		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}
}