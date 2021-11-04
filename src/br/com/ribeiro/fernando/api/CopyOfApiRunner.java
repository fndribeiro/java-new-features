package br.com.ribeiro.fernando.api;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Fernando");
		names.add("Giovanna");
		names.add("Bia");
		
		/**
	     * Returns an unmodifiable List</a> containing the elements of
	     * the given Collection, in its iteration order. The given Collection must not be null,
	     * and it must not contain any null elements. If the given Collection is subsequently
	     * modified, the returned List will not reflect such modifications.
	     *
	     * @implNote
	     * If the given Collection is an <a href="#unmodifiable">unmodifiable List</a>,
	     * calling copyOf will generally not create a copy.
	     *
	     * @param <E> the {@code List}'s element type
	     * @param coll a {@code Collection} from which elements are drawn, must be non-null
	     * @return a {@code List} containing the elements of the given {@code Collection}
	     * @throws NullPointerException if coll is null, or if it contains any nulls
	     * @since 10
	     * Also available in Sets and Maps.
	     */
		List<String> copyOfNames = List.copyOf(names);
		
		copyOfNames.add("Rafael");
		
		// CONSOLE OUTPUT
		// Exception in thread "main" java.lang.UnsupportedOperationException
		
	}

}
