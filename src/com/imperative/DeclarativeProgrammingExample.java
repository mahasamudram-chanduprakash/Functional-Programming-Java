package com.imperative;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.imperative.ImperativeProgrammingExample.Gender;
import com.imperative.ImperativeProgrammingExample.Person;

public class DeclarativeProgrammingExample {

	public static void main(String[] args) {
		List<Person> personList = List.of(new Person("John", Gender.MALE), new Person("Xavier", Gender.MALE),
				new Person("Scarlett", Gender.FEMALE), new Person("Aisha", Gender.FEMALE));
		
		Predicate<Person> femalePredicate = person -> Gender.FEMALE.equals(person.getGender());
		Predicate<Person> malePredicate = person -> Gender.MALE.equals(person.getGender());

		List<Person> females = personList.stream().filter(femalePredicate)
				.collect(Collectors.toList());

		females.forEach(System.out::println);

		List<Person> male = personList.stream().filter(malePredicate)
				.collect(Collectors.toList());

		male.forEach(System.out::println);

	}

}
