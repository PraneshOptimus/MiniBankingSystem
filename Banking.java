import java.util.Scanner;
public class Banking{
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int balance = 30000;
        boolean bool =true;
        while(bool)
        {
            System.out.println("1) check Balance ");
            System.out.println("2) Deposit Amount ");
            System.out.println("3) Withdraw Amount ");
            System.out.println("4) Exit ");
            int num=sc.nextInt();
            switch(num)
            {
                case 1 :
                    System.out.println("Your balance is: "+balance);
                    break;
                case 2:
                    System.out.println("You Selected : Deposit Money");
                    System.out.print("Enter the Money You Want to Deposit : ");
                    int dep = sc.nextInt();
                    balance += dep;
                    System.out.println("Your Currenctr A/C Balance is : "+balance);
                case 3:
                    System.out.println("You Selected : withdraw the Money");
                    System.out.print("Enter the withdrawal Amount : ");
                    int with = sc.nextInt();
                    if(balance<with)
                    {
                        System.out.println("Insufficient Balance !");
                    }
                    else {
                    balance -= with;
                    System.out.println("Withdrawal Successfull ! ");
                    System.out.println("Your Current A/C Blance is : "+balance);
                    }
                    break;
                case 4 :
                    System.out.println("Thank You For Banking With us");
                    bool = false;
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        }
    }
}