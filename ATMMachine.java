package CODSOFT;
import java.util.Scanner;
class Account
{
    String name, userName,password;
    Float balance= 00f;
    int transaction=0;
    public void register()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Your Name ; ");
        this.name = sc.nextLine();
        System.out.println("Enter the Your UserName ; ");
        this.userName = sc.nextLine();
        System.out.println("Enter the Your Password ; ");
        this.password = sc.nextLine();
    }
    public boolean Status()
    {
        boolean isStatus = false;
        Scanner sc= new Scanner(System.in);
        while(!isStatus)
        {
            System.out.println("Enter Your UserName :");
            String UserName = sc.nextLine();
            if(UserName.equals(userName))
            {
                while(!isStatus)
                {
                    System.out.println("Enter your Password :");
                    String Password =sc.nextLine();
                    if (Password.equals(password))
                    {
                        System.out.println("Status : You are Logged in ! ");
                        isStatus=true;
                    }
                    else
                    {
                        System.out.println("Incorrect Password ");
                    }
                }
            }
            else
            {
                System.out.println("Incorrest UserName !");
            }
        }
        return isStatus;
    }
    public void withdraw()
    {
        System.out.println(" Enter Amount to withdraw : ");
        Scanner sc =  new Scanner(System.in);
        float amount=sc.nextFloat();
        try{
            if(balance>=amount)
            {
                transaction++;
                balance -=amount;
                System.out.println("Withdraw successful!");
            }
            else
            {
                System.out.println("Ensufficient Balance! ");
                System.out.println("Your Balance is : "+ balance);
            }
        }catch(Exception e){}
    }
    public void deposit()
    {
        System.out.println(" Enter Amount to Deposit \n 'minimum 500': ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try
        {
            if (amount>= 500)
            {
                transaction++;
                balance += amount;
                System.out.println("Deposit successful!");
            } else
            {
                System.out.println("Sorry you can not deposite amount less then 500! ");
            }
        } catch (Exception e) {}
    }
    public void checkBalance()
    {
        System.out.println("Your current Balance is :"+balance+" Rs");
    }

    public void Transaction()
    {
        if (transaction==0)
        {
            System.out.println("No Transaction Happend!");
        }
        else
        {
            System.out.println("You completed Transaction :"+transaction +"  this time");
        }
    }
}
public class ATMMachine {
    public static int number(int limit){
        int input =0;
        boolean flag=false;
        while(!flag){
            try{
                Scanner sc=new Scanner(System.in);
                input=sc.nextInt();
                flag=true;

                if(flag && input > limit || input < 1){
                    System.out.println("Choose the no. between 1 to "+limit);
                    flag=false;
                }
            }catch(Exception e){
                System.out.println("Enter only integer value");
                flag =false;
            }
        }
        return input;
    }
    public static void main(String[]args){
        System.out.println("####################  WELCOME  TO LeLo Bank  Of INDIA #############################");
        System.out.println("Enter 1 for Register");
        System.out.println("Enter 2 for Exit");
        int choose =number(2);
        if(choose==1){
            Account a=new Account();
            a.register();
            while(true){
                System.out.println("Enter 1- Login or 2- Exit ");
                int c =number(2);
                if(c==1){
                    if(a.Status()){
                        System.out.println("####################  Login  as ! "+a.name+" #############################");
                        boolean isFinish=false;
                        while(!isFinish){
                            System.out.println("1.Withdraw \n 2.Deposite \n 3.Check Balance. \n 4.Transaction \n 5.Exit");
                            System.out.println("Enter Your Choice: ");
                            int x=number(5);
                            switch(x){
                                case 1:
                                    a.withdraw();
                                    break;
                                case 2:
                                    a.deposit();
                                    break;
                                case 3:
                                    a.checkBalance();
                                    break;
                                case 4:
                                    a.Transaction();
                                    break;
                                case 5:
                                    isFinish=true;
                                    break;
                            }
                        }
                    }
                }
                else{
                    System.exit(0);
                }
            }
        }else {
            System.exit(0);
        }
    }
}