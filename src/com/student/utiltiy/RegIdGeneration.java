package com.student.utiltiy;

public class RegIdGeneration {
	public static int generateId() {

		// random function generates value between 0.0000111 to 0.9999

		return (int) (Math.random() * 10000);
	}


}
