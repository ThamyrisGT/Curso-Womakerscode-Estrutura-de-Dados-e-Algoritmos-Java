package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class MainAula5 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.toString());
		System.out.println(vetor.busca(5));

	}

}
