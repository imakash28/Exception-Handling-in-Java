package Service;

public interface CalculatorService {

	//... 3 dots not represent the array as such and instead it represents the where X this means that there can be zero integers, one integers, two integers or any number of integers. so the array will be created at the runtime. we dont need to pass the array as such and instead you can just pass the integers comma seprated
	void divide(Integer... array);	
}
