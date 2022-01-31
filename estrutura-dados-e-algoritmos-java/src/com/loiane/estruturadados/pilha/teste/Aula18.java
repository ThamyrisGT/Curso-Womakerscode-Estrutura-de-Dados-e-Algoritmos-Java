package com.loiane.estruturadados.pilha.teste;

import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>(); // biblioteca do java

		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);

		System.out.println(stack.peek());  // espiar elemento no topo da pilha

		System.out.println(stack.pop()); // remover elemento // desempilhar 

		System.out.println(stack);
	}

}
