package AtmInterface;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationImpl op =new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=1234;
		Scanner sc= new Scanner(System.in);
		System.out.println("******Welcome to ATM Machine*****");
//		System.out.println("Enter Atm Number : ");
//		int atmNumber=sc.nextInt();
		System.out.println("Enter Pin : ");
		int pin=sc.nextInt();
		if(atmpin==pin ) {
			while(true) {
				System.out.println("1.View Available Balance\n 2.Withdraw Amount\n 3.Deposite Amount\n 4.View Ministatement\n 5.Exit");
				System.out.println("Enter Choice: ");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					op.viewBalance();
					break;
				case 2:
					System.out.println("Enter Amount to Withdrawn ");
					double withdrawAmount=sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					break;
				case 3:
					System.out.println("Entar Amount TO Deposite");
					double depositeAmount=sc.nextDouble();
					op.depositeAmount(depositeAmount);
					break;
				case 4:
					op.viewMiniStatement();
				case 5:
					System.out.println("Collect Your Atm Card\n Thank You For Visiting!!");
					System.exit(0);
				default:
					System.out.println("Please Entar Correct Statement");
					
				}
				
			}
			
//			System.out.println("Validation Done");
		}else {
			System.out.println("Invalid Atm number and pin ");
			System.exit(0);
		}
		

	}

}
