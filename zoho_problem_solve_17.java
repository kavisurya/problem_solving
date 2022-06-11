import java.util.Scanner;

public class zoho_problem_solve_17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Getting input from the user
        System.out.println("Enter the numbers : ");
        String number = scan.nextLine();
        String left,right,middle,reverse_number = "";
        Boolean if_all_9 = false;

        // Checking if all 9
        for(int i=0; i < number.length(); i++)
        {
            if(number.charAt(i) != '9')
            {
                if_all_9 = true;
            }

        }

        // If all the numbers are not 9
        if(if_all_9)
        {
               // If the lengths equal to 1
            if(number.length() == 1)
            {
                System.out.println("11");
            }
            // If the lengths equal to 2

            else if(number.length() == 2)
            {
                int temp_store =  (int) number.charAt(0);
                System.out.println((char)++temp_store + ""+(char)temp_store);
            }
            // For ODD numbers
            // If the number length > 3
            else if(number.length() >= 3 && (number.length() % 2 == 1))
            {

                // Just separating the values
                left = number.substring(0, number.length()/2);
                middle = String.valueOf(number.charAt(number.length()/2));
                right = number.substring(number.length()/2 + 1, number.length());



                // Comparing left last index and right 1st index
                // like 7 < 8 will be increment 
                if(Integer.valueOf(left.charAt(left.length()-1)) <= Integer.valueOf(right.charAt(0)))
                {
                    // Creating temp increment variable
                    int increment = Integer.valueOf(middle);
                    middle = String.valueOf(++increment);

                    // if the middle length == 2
                    // Which mean if the middle element is 9, the next element is 10 
                    if(middle.length() == 2)
                    {
                        // So, the next element is 10, so definitely the middle element is 0
                        middle = "0";
                        // Then incrementing left last index
                        int temp_increment = Integer.valueOf(left.charAt(left.length()-1));
                        left = left.substring(0, left.length()-1) + String.valueOf((char) ++temp_increment);
                    }
            
                }

                // Reversing the left elemrnt
                for(int i=0; i < left.length(); i++)
                {
                    reverse_number = left.charAt(i) + reverse_number;
                }


                System.out.print(left+middle+reverse_number);

            }






            // For even numbers
            else if(number.length() >= 4 && (number.length() % 2 == 0))
            {
                // Separating the values
                int number_limit = (number.length() / 2);
                left = number.substring(0, number_limit - 1);
                middle = number.substring(number_limit-1, number_limit+1);
                right = number.substring(number_limit+1 , number.length());



                // Creating temp increment variable
                int increment = Integer.valueOf(middle);
                middle = String.valueOf(increment+10);

                // if the middle length == 2
                // Which mean if the middle element is 9, the next element is 10 
                if(middle.length() == 3)
                {
                    // So, the next element is 10, so definitely the middle element is 0
                    middle = "00";
                    // Then incrementing left last index
                    int temp_increment = Integer.valueOf(left.charAt(left.length()-1));
                    left = left.substring(0, left.length()-1) + String.valueOf((char) ++temp_increment);
                }
        

                // Reversing the left elemrnt
                for(int i=0; i < left.length(); i++)
                {
                    reverse_number = left.charAt(i) + reverse_number;
                }

                

                // gettig the middle value
                // Like 42 = 4 4. Getting 1st index only
                middle = middle.charAt(0) + String.valueOf(middle.charAt(0));

                // Print the output
                System.out.println(left+middle+reverse_number);

  
            }
        
        }
        else{
            int number_int = Integer.valueOf(number);
            System.out.println(2+number_int);
        }
    }   
}





// System.out.println(left);
// System.out.println(middle);
// System.out.println(right);
// System.out.println(reverse_number);