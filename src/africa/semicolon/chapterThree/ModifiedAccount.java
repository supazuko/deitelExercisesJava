public class ModifiedAccount{

	private String name;
	private double balance;

	public ModifiedAccount (String name, double balance){
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;
	}
	public void deposit(double depositAmount){
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	public void withdraw(double withdrawalAmount) {
		if (withdrawalAmount > balance) {
			System.out.println("Withdrawal amount cannot exceed account balance.");}
		 if (withdrawalAmount < balance && withdrawalAmount > 0){
			balance = balance - withdrawalAmount;
		}
	}
	public double getBalance(){
		return balance;
	}
	public void setName(String name){
        	this.name = name;
    	}
	public String getName(){
		return name;
	}
	

}