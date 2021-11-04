package br.com.ribeiro.fernando.api;

import br.com.ribeiro.fernando.domain.EmployeeRecord;

// since Java 16
public class RecordsRunner {
	
	// default constructor
	record Person(String name, String email, String phoneNumber) {}
	
	// custom constructor
	record AnotherPerson(String name, String email, String phoneNumber) {
		AnotherPerson {
			if (name == null) {
				throw new IllegalArgumentException("Name is null");
			}
		}
	}

	public static void main(String[] args) {
		
		var person = new Person("Fernando", "test@email.com", "5599777");
		
		System.out.println(person.name());
		System.out.println(person.email());
		System.out.println(person.phoneNumber());
		
		// Fernando
		// test@email.com
		// 5599777
		
		EmployeeRecord employee = new EmployeeRecord("Fernando", 20);
		
		employee.id();
		
	}

}
