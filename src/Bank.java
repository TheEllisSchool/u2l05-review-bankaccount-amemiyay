import javax.swing.JOptionPane;

public class Bank {

	public static void main(String[] args) {
		//instance of a BankAccount
		BankAccount ericasAccount = new BankAccount ("Erica Davis", 500, 150);
		
		//deposit a check
		ericasAccount.deposit();
		
		//withdraw
		ericasAccount.withdraw();
		
		//display balance
		JOptionPane.showMessageDialog(null, ericasAccount);

	}

}
