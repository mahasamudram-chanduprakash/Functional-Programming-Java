package com.imperative;

import java.util.ArrayList;
import java.util.List;

public class ImperativeProgrammingExample {

	public static void main(String[] args) {
		
		List<Person> personList = List.of(
				new Person("John", Gender.MALE),
				new Person("Xavier", Gender.MALE),
				new Person("Scarlett", Gender.FEMALE),
				new Person("Aisha", Gender.FEMALE));
		
		List<Person> females = new ArrayList<Person>();
		for(Person person: personList) {
			if(Gender.FEMALE.equals(person.getGender())) {
				females.add(person);
			}
		}
		
		for(Person female: females) {
			System.out.println(female);
		}
		
		List<Person> males = new ArrayList<Person>();
		for(Person person: personList) {
			if(Gender.MALE.equals(person.getGender())) {
				males.add(person);
			}
		}
		
		for(Person male: males) {
			System.out.println(male);
		}

	}
	
	static class Person{
	
		
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + getGender() + "]";
		}

		public Gender getGender() {
			return gender;
		}
		public String getName() {
			return name;
		}


	}
	
	public enum Gender{
		MALE,FEMALE;
	}

}
