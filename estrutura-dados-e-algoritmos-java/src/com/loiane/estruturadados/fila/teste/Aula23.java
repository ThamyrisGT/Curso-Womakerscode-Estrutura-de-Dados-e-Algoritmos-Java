package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();  // é a classe que representa a lista encadeada, a Queue é uma interface
													// ou seja, instanciando ela, você só consegue implementar os métodos da interface
		
		fila.add(1); //enqueue - enfileirar
		fila.add(2);
		
		System.out.println(fila);

		System.out.println(fila.peek()); //espiar
		
		System.out.println(fila.remove()); //dequeue - desenfileirar
		
		System.out.println(fila);
	}

}
