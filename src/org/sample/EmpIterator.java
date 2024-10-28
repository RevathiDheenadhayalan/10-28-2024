package org.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EmpIterator {

	public static void main(String[] args) {

		// Creating object for Arraylist class

		ArrayList<Integer> a1 = new ArrayList<>();

		// Adding Values to the Arraylist

		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);

		// Perform Iterator Forward

		ListIterator<Integer> listIterator = a1.listIterator();

		System.out.println("FORWARD");

		while (listIterator.hasNext()) {

			Integer next = listIterator.next();

			System.out.println(next);

		}

		// Perform Iterator Backward

		System.out.println("BACKWARD");

		while (listIterator.hasPrevious()) {

			Integer previous = listIterator.previous();

			System.out.println(previous);

		}

	}

}


