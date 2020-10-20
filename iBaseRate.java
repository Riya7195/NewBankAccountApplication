package BankAccountApp;

public interface iBaseRate {

	//write a method that returns the base rate
	default double getBaseRate() {  //An API 
		return 2.5;
	}
}
