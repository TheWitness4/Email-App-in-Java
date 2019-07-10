package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		System.out.println(em1.showInfo());
		//em1.changePassword(password); change (password) to a new password " '
		//em1.changePassword("ILoveJava");
		//System.out.println("Your new password: " + em1.getPassword());
		//em1.setAlternateEmail(altEmail); changes alternate email
		//em1.setMailboxCapacity(capacity); change mailbox capacity
	}

}
