package serviceImpl;

import Service.CalculatorService;

public class CalculatorServiceIml implements CalculatorService {

	@Override
	public void divide(Integer... array) {
		int quotient = 0;
		quotient = array[0] / array[1]; // at index [0] we are getting numerator and at index [1] we are getting denumerator
		System.out.println("Quotient of" + array[0] + " and " + array[1] + " is " + quotient);
	}

}
