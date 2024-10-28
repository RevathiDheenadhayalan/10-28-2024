package org.sample;

import java.util.Enumeration;
import java.util.Hashtable;

public class EmployeeEnum {

	public static void main(String[] args) {

		// Creating object for Hashtable Class

		Hashtable<Integer, String> h = new Hashtable<>();

		// Adding Values to the Hashtable

		h.put(1, "A");
		h.put(2, "B");
		h.put(3, "C");
		h.put(4, "D");
		h.put(5, "E");

		System.out.println(h);

		Enumeration<Integer> keys = h.keys();

		while (keys.hasMoreElements()) {

			Integer nextElement = keys.nextElement();

			System.out.println(nextElement);
		}

	}
}
