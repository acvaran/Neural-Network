package com.Formulas;

public class Formulas {

	// Returns a random double number between -1 and 1 to be used as weights on
	// links
	public static double randomWeight() {
		return (Math.random() * 2) - 1;
	}

	// Returns the output of a sigmoid function to be used in determining the
	// state of a node
	public static double sigmoidFunction(double x) {
		return 1 / (1 + Math.pow(Math.E, (-1 * x)));
	}
}
