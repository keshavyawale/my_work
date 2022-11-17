/*Q2 : Develop a class BankAccount having following data members : (10 Marks)
        int accno
        double balance
        Write appropriate constructors to initialize data members
        Define the following functions :
        withdraw : balance will reduce
        deposit : balance will increase
        show : display accno and balance
        If user tries to withdraw more than the balance, use exception handling code.
        Demonstrate the concept of exception handling in main() function.*/

import java.util.Scanner;
public class BankAccount {
    int accno;
    double balance;
    Scanner sc=new Scanner(System.in);
    BankAccount(int a , double b)
    {
        this.accno=a;
        this.balance=b;
    }
    void withdraw() throws Exception
    {
        double amount;
        System.out.println("enter withdraw amount");
        amount=sc.nextInt();
        if (balance>=amount)
        {
            balance-=amount;
            System.out.println("remaining balance is "+balance);
        }
        else
        {
        throw new Exception("not sufficient balance");
        }
    }
    void deposit() {
        int amount;
        System.out.println("enter deposit amount ");
        amount = sc.nextInt();
        if (amount >= 0) {
            balance += amount;
            System.out.println("balance is " + balance);
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
    void show(){
        System.out.println("account no is "+accno+" balance is "+balance );
    }
}
 class Ex{
    public static void main(String[] args) {
        BankAccount bank=new BankAccount(87654,6000);
        bank.show();
        bank.deposit();
        bank.show();
        try
        {
            bank.withdraw();
        }
        catch(Exception b)
        {
            System.out.println(b);
        }
        bank.show();
    }
}
