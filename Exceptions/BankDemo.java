import java.io.*;
class CurrentAccount
{
private double balance;
private int number;

public CurrentAccount(int n)
{
this.number = n;
this.balance = 1000;
}

public void Deposit(double amt)
{
balance+=amt;
}

public void knowBalance()
{
System.out.println("Your current balance = "+ balance);
}

public void Withdraw(double amt)throws InSufficientFundsException
{
if (balance < amt)
{
double need = amt - balance;
throw new InSufficientFundsException(need);
}
else
{
balance-=amt;
System.out.println("You remaining balance is: "+ balance);
}
}
}

class InSufficientFundsException extends Exception
{
public InSufficientFundsException(double need)
{
System.out.println("You're running short of money, you need "+ need);
}
}

class BankDemo
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter account number");
int an = Integer.parseInt(br.readLine());
CurrentAccount AC = new CurrentAccount(an);
System.out.println("Press 1. to deposit, 2. to withdraw 3. to see balance 4. Exit");
int choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
System.out.println("Enter amount to deposit");
double am = Double.parseDouble(br.readLine());
AC.Deposit(am);
break;
case 2:
System.out.println("Enter amount to withdraw");
double at = Double.parseDouble(br.readLine());
try{
AC.Withdraw(at);
}
catch(InSufficientFundsException e)
{
System.out.println(e);
}
break;
case 3:
AC.knowBalance();
break;
default :
System.out.println("Bye Bye");
break;
};

}
}