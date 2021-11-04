package br.com.ribeiro.fernando.api;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(3,4,5,67,89,88);
		
		// 1
		numbers
			.stream()
			.filter(number -> !(number%2==0))
			.forEach(System.out::println);
		
		// 2
		numbers
			.stream()
			.filter(number -> !isEven(number))
			.forEach(System.out::println);
		
		// 3
		numbers
			.stream()
			/**
		     * Returns a predicate that is the negation of the supplied predicate.
		     * This is accomplished by returning result of the calling
		     * {@code target.negate()}.
		     *
		     * @param <T>     the type of arguments to the specified predicate
		     * @param target  predicate to negate
		     *
		     * @return a predicate that negates the results of the supplied
		     *         predicate
		     *
		     * @throws NullPointerException if target is null
		     *
		     * @since 11
		     */
			.filter(Predicate.not(PredicateNotRunner::isEven))
			.forEach(System.out::println);
	}
	
	public static boolean isEven(Integer number) {
		return number%2==0;
	}
	
	// CONSOLE OUTPUT: 3, 5, 67, 89

}
