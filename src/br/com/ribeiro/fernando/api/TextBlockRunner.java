package br.com.ribeiro.fernando.api;

public class TextBlockRunner {

	public static void main(String[] args) {
		
		String logExample = """
				Line 1: Request number is %d
				Line 2: My "new" age is %d
				Line 3: My name is %s
				"""
				.formatted(100, 32, "Fernando");
		
		System.out.println(logExample);
		
		// Line 1: Request number is 100
		// Line 2: My "new" age is 32
		// Line 3: My name is Fernando

	}

}
