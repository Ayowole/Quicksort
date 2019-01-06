package com.ayowole.quicksort;

public class Quicksort {
	
	private Student[] students;
	private int leftIndex;
	private int rightIndex;
	
	public Quicksort(Student[] students) {
		this.students = students.clone();
	}
	
	public Student[] sort() {
		quicksort(0, students.length);
		return students;
	}
	
	private void quicksort(final int begin,final int end) {
		leftIndex = begin;
		rightIndex = end -1;
		final var pivo = students[(begin + end) / 2];
		
		while(leftIndex <= rightIndex) {
			leftSide(end, pivo);
			rightSide(begin, pivo);
			
			change();
		}
		
		if (rightIndex > begin) {
			quicksort(begin, ++rightIndex);
		}
		
		if (leftIndex < end) {
			quicksort(leftIndex, end);
		}
	}
	
	private void leftSide(int end, Student pivo) {
		while (students[leftIndex].getAge() < pivo.getAge() && leftIndex < end) {
			leftIndex++;
		}
	}
	
	private void rightSide(int begin, Student pivo) {
		while (students[rightIndex].getAge() > pivo.getAge() && rightIndex > begin) {
			rightIndex--;
		}
	}

	private void change() {
		if (leftIndex <= rightIndex) {
			var aux = students[leftIndex];
			students[leftIndex] = students[rightIndex];
			students[rightIndex] = aux;
			leftIndex++;
			rightIndex--;
		}
	}

}
