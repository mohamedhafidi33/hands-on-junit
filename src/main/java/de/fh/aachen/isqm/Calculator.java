package de.fh.aachen.isqm;

public class Calculator {

	// Adds two numbers
	public double add(double a, double b) {
		return a + b;
	}

	// Subtracts the second number from the first
	public double subtract(double a, double b) {
		return a - b;
	}

	// Multiplies two numbers
	public double multiply(double a, double b) {
		return a * b;
	}

	// Divides the first number by the second
	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return a / b;
	}

	// Returns the result of raising a to the power of b
	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	// Returns the square root of a number
	public double squareRoot(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("Cannot compute square root of a negative number.");
		}
		return Math.sqrt(a);
	}
}
