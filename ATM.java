import java.util.Scanner;
import java.util.Random;
class User
{
int UserId,Userpin,Balance;
int password,withdraw,deposit,transfer;




void input()
{
Random ra=new Random();
Balance=ra.nextInt(2000,100000);
Scanner sc=new Scanner(System.in);
System.out.println("Enter Pin:");
Userpin=sc.nextInt();
UserId=ra.nextInt(100);

}

void Withdraw()
{
Scanner sc=new Scanner(System.in);
if(withdraw<=Balance)
{
System.out.println("Enter The Amount to be Withdraw");
withdraw=sc.nextInt();
Balance=Balance-withdraw;
System.out.println("Balance:"+Balance);
}
else
{
System.out.println("You Do not have That much Balance:");
System.out.println("Balance :"+Balance);
}
}
void Deposit()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to be Deposit");
deposit=sc.nextInt();
Balance=Balance+deposit;
System.out.println("Balance:"+Balance);
}
void Transition()
{
System.out.println("Deposit:"+deposit);
System.out.println("Withdraw:"+withdraw);
System.out.println("Tranfer:"+transfer);
System.out.println("Balance:"+Balance);
}
void Transfer()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The amount to be transfer");
transfer=sc.nextInt();
if(Balance>=transfer)
{
System.out.println("Transfer Successfully");
Balance=Balance-transfer;
System.out.println("Balance:"+Balance);
}
else
{
System.out.println("You do not have sufficient Balance to Transfer money");
}

}
}
class ATM
{
public static void main(String ar[])
{
int ch;
User u=new User();
System.out.println("ATM Machine");
System.out.println("State Bank of India");
System.out.println("Swap the Card first");
u.input();
for(int i=0;i<=3;i++)
{
System.out.println("1.Transition History");
System.out.println("2.Withdraw");
System.out.println("3. Deposit");
System.out.println("4.Transfer");
System.out.println("5.Quite");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
do
{
switch(ch)
{
case 1:
	u.Transition();
	break;
case 2:
	u.Withdraw();
	break;
case 3:
	u.Deposit();
	break;
case 4:
	u.Transfer();
	break;
}
}while(ch==5);
{
System.out.println("Exist");


}
}
}
}

	





