package com.Formulas;

public class Formulas {

	public static double randomWeight() {
		return (Math.random() * 2) - 1;
	}

	public static double sigmoidFunction(double x) {
		return 1 / (1 + Math.pow(Math.E, (-1 * x)));
	}
}
