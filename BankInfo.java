package week3Assgns;

public class BankInfo {
     
public void savings() {
		
		System.out.println("your savings");
	}
public void fixed() {
		
		System.out.println("fixed amount 500000");
	}

public void deposit() {
	
	System.out.println("deposit here in bank");
}

	public static void main(String[] args) {
		
		BankInfo bank=new BankInfo();
		bank.deposit();
		bank.fixed();
		bank.savings();
		
	}

}
