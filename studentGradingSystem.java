package CODSOFT;
import java.util.Scanner;

public class studentGradingSystem {
    public static void main(String[]args){
        int i,j,sum = 0;
        double percentage;
        System.out.println("How many subjects you have :");
        Scanner sc= new Scanner(System.in);
        int subjectNumber=sc.nextInt();
        for(i=1;i<=subjectNumber;i++)
        {
            System.out.println("Enter the Name of subject ;");
            Scanner name=new Scanner(System.in);
            String Subject=name.nextLine();
            for(j=1;j<=subjectNumber;j++)
            {
                System.out.println("Enter the marks of Subject :");
                Scanner no = new Scanner(System.in);
                int marks= no.nextInt();
                sum+=marks;
                break;
            }

        }
        percentage = ((double) sum /(subjectNumber*100))*100;
        System.out.println("Percentage of the user : "+ percentage);
        if(percentage>=40 && percentage<60){
            System.out.println("You score C grade");
        }
        else if(percentage>=60 && percentage<80){
            System.out.println("You score B grade");
        }
        else if(percentage>=80 && percentage<=100){
            System.out.println("You score A grade");
        }
        else{
            System.out.println("You Failed ");
        }
    }
}
