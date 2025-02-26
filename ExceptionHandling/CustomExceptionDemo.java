package ExceptionHandling;

class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(float amt) {
		try {
			if (balance < amt) {
				throw new InsufficientBalance("InsufficientBalance");
			} else {
				balance -= amt;
			}
			System.out.println("Amount withdraw successfully.....");
			System.out.println("Your balance is:  " + balance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Account acc=new Account(10000);
		acc.withdraw(2000);
	}
}
