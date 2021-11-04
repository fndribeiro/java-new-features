package br.com.ribeiro.fernando.api;

public class SwitchExpressionRunner {

	public static void main(String[] args) {
		
		var day = 0;
		
		String dayOfWeek = switch(day) {
		
			case 0 -> {
				System.out.println("Do some complex logic here.");
				yield "Sunday";
			}
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			default -> throw new IllegalArgumentException("Unexpected value: " + day);
		
		};
		
		System.out.println(dayOfWeek);
		
	}

}
