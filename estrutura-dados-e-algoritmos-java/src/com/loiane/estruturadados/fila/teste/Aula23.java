package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();  // � a classe que representa a lista encadeada, a Queue � uma interface
													// ou seja, instanciando ela, voc� s� consegue implementar os m�todos da interface
		
		fila.add(1); //enqueue - enfileirar
		fila.add(2);
		
		System.out.println(fila);

		System.out.println(fila.peek()); //espiar
		
		System.out.println(fila.remove()); //dequeue - desenfileirar
		
		System.out.println(fila);
	}

}
