/*import java.util.Scanner;
class  Bank{
	int password;
	int deposit;
	int accountbalance;
	int withdraw;
	String exit;
}
class SBI
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    Bank b1 = new Bank();
		int pin;
		pin = 1234;
		System.out.println("welcome to SBI bank");
		System.out.println("Enter the 4 digit oassword");
		pin = scan.nextInt();
		while(pin != 1234){
			
			
		}

		if(pin == 1234)
	{
		System.out.println("password is valid");
	}
	else{
		System.out.println("password in invalid");

}
	}}*/



	import java.util.Scanner;

public class SBI {
    public static void main(String[] args) {
         int MAX_LOGIN_ATTEMPTS = 3;
         String CORRECT_PASSWORD = "password123";

        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;

        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful!");
                
                break;
            } else {
                loginAttempts++;
                System.out.println("Invalid password. Attempts remaining: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));
            }
        }


        if (loginAttempts == MAX_LOGIN_ATTEMPTS) {
            System.out.println("Maximum login attempts reached. Your account has been terminated.");
            
        }
        
        scanner.close();
    }
}

