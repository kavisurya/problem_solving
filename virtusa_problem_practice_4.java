import java.util.*;

public class virtusa_problem_practice_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day  :");
        int day = scanner.nextInt();

        System.out.println("Enter the month  :");
        int month = scanner.nextInt();

        System.out.println("Enter the year  :");
        int year = scanner.nextInt();

        if(day <= 31 && month <= 12)
        {
            int flag = 0;
            // Checking leap year
            if((year % 4 == 0) && (year % 100 != 0) ||  (year % 400 == 0) )
            {
                if(day <=29 && month == 2)
                {
                    flag = 0;
                }
                else{
                    flag = 1;
                }
            }
            // If not leap year
            else
            {
                // Checking the the feb month > 28
                if(day >= 29 && month == 2 || flag == 1)
                {
                
                    // System.out.println("In-valid ");
                    flag = 1;
                }
                else if(flag == 0)
                {
                    flag = 0;
                    // System.out.println("Valid !");
                }
                else
                {
                    flag = 0;
                    // System.out.println("Valid !");
                }
            }


            if(flag == 0)
            {
                System.out.println("Valid !");
            }
            else
            {
                System.out.println("In-Valid !");
            }

            
        }

        else
        {
            System.out.println("Invalid Date ");
        }
        
    }
}