package com.ayowole.quicksort;

public class Main {
	
	public static void main(String[] args) {
		
		Student[] students = {
				new Student("Eduardo", 20),
				new Student("Pedro", 21),
				new Student("Joao", 40),
				new Student("Carlos", 30),
				new Student("Elgenio", 31),
				new Student("Barney", 2),				
				new Student("Pablo", 60),				
				new Student("Julio", 19),				
				new Student("Pablo", 42)			
		};
		
		Quicksort quicksort = new Quicksort(students);
		Student[] orderedStudents = quicksort.sort();
		
		for (Student student : orderedStudents) {
			System.out.println(student);
		}
	}
	
}
