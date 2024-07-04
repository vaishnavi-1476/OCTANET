package task_first;
import java.util.*;
public class Atm_machine {
	float Balance;
	//PIN number is
	int PIN=1476;
	public static void main(String[] args) 
	{
		Atm_machine obj=new Atm_machine();
		obj.Check();
		

	}
	
	public void Check() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the PIN ");
		int Currentpin=sc.nextInt(); 
		if(PIN==Currentpin) {
			Atm_tasks();
		}
		else {
			System.out.println("enter the valide pin");
			Check();
		}
	}
	
public  void Atm_tasks() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the choice");
	System.out.println("Welcome To ATM Machine");
	System.out.println("1.deposit(amount)");
	System.out.println("2.withdraw(amount)");
	System.out.println("3.checkBalance()");
	System.out.println("4.Channge PIN");
	System.out.println("5.Exit");
	int choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		dipositeMoney();
		break;
	
	case 2:
		WithdrawMoney();
		break;
	case 3:
		BankBalance();
		break;
	
	
	case 4:
		Changepin() ;
		break;
	case 5:
		break;
	}
	
	}


public void BankBalance() 
{
	System.out.println("bank balnce is "+Balance);
	Atm_tasks();
}

public void dipositeMoney()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount to deposite ");
    float amount=sc.nextFloat();
    Balance=amount+Balance;
    System.out.println("now your total amount is "+Balance);
    Atm_tasks();
}


public void WithdrawMoney() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount to withdraw ");
	int amount=sc.nextInt();
	if(amount>Balance) {
		System.out.println("your withdrawle amount is more than your bank balance please enter valide amount");
		Atm_tasks();
	}
	else 
	{
		float remain=Balance-amount;
		System.out.println("yor remaining bank balance is "+remain);
		Atm_tasks();
	}
}

public void Changepin() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the current PIN");
	int current_pin=sc.nextInt();
	if(current_pin==PIN) {
		System.out.println("enter the new pin");
		int New_PIN=sc.nextInt();
		PIN=New_PIN;
		Check();
		
	}else {
		System.out.println("enter the valide current PIN");
		Check();
	}
	
	
}
}

