package week3Assgns;

public class AxisBank extends BankInfo {
      
	
public void deposit() {
		
		System.out.println("Override AxisBank deposit");
		//method Overriding
		//use super keyword to access super class override method.
		super.deposit();
		
	}
	public static void main(String[] args) {

             AxisBank a=new AxisBank();
             a.deposit();
             a.fixed();
             a.savings();
             
	}
}
