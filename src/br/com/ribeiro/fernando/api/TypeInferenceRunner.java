package br.com.ribeiro.fernando.api;

import java.util.ArrayList;

public class TypeInferenceRunner {

	public static void main(String[] args) {

		// Java compiler infers the type of the variable at compile time.
		// var cannot be assigned to null
		// since Java 10
		var numbers = new ArrayList<Integer>();
		
		numbers
			.forEach(System.out::println);
		
	}

}
