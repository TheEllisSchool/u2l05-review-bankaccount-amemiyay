import javax.swing.JOptionPane;

public class BankAccount {
	//attributes
	private String holderName;
	private int currentBalance;
	private int lowestBalance;
	
	//methods
	//constructor
	public BankAccount (String hn, int cb, int lb) {
		holderName = hn;
		currentBalance = cb;
		lowestBalance = lb;
	}
	
	public BankAccount (String hn, int cb) {
		holderName = hn;
		currentBalance = cb;
		lowestBalance = 100;
	}
	
	//setter for lowest balance ensuring value is positive
	public void setLowestBalance(int lb) {
		if (lb < 0) {
			System.out.println("Balance is impossible");
		} else {
			lowestBalance = lb;
		}
	}
	//getter for lowest balance
	public int getLowestBalance() {
		return lowestBalance;
	}
	
	//setter for balance
	private void setCurrentBalance(int cb) {
		currentBalance = cb;
	}
	
	//getter for balance
	public int getCurrentBalance() {
		return currentBalance;
	}
	
	//setter for holder name
	public void setHolderName(String hn) {
		holderName = hn;
	}
	
	//method for deposit
	public void deposit() {
		String input = JOptionPane.showInputDialog("How much do you want to deposit?");
		double amount = Double.parseDouble(input);
		currentBalance += amount;
	}
	
	//method for withdrawal
	public void withdraw() {
		String input = JOptionPane.showInputDialog("How much do you want to withdraw?");
		double amount = Double.parseDouble(input);
		if ((currentBalance - amount) >= lowestBalance) {
			currentBalance -= amount;
		} else {
			String answer = JOptionPane.showInputDialog(null, "Are you sure? Answer 'yes' or 'no'");
			if (answer.equals("yes")) { //answer.equals("yes")
				currentBalance -= amount;
			} 
		}
	}
	
	//to string method (return type = String)
		public String toString() {
			String accountInfo = holderName + "'s account holds $" + currentBalance 
				+ " with a lowest balance allowable of $" + lowestBalance;
			return accountInfo;
		}
}
