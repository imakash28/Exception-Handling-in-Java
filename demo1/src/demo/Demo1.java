package demo;

import Service.CalculatorService;
import serviceImpl.CalculatorServiceIml;

public class Demo1 {

	public static void main(String args[]) {
		CalculatorService calculatorService = new CalculatorServiceIml();	// Here, we are creating the object of CalculatorServiceImpl class
		System.out.println("----SCENERIO 1----");
		calculatorService.divide(10,2);
		System.out.println("----SCENERIO 2----");
		calculatorService.divide(10,0);
	}
}
