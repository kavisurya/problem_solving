import java.util.*;

public class zoho_problem_solve_22 {
    public static void main(String[] args) {
        int large_from = 0;
        int large_to = 0;
        int previous_count = 0;

        // Array values
        // int array_values[] = {0,0,1,0,0,1,0,0,0,1,1,1,1};
        // int array_values[] = {1,0,0,0,1};

        // int array_values[] = {1,1,0,0};

        // Getting input from the user
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = scan.nextInt();
        int array_values[] = new int[n];

        for(int i=0; i < n; i++)
        {
            System.out.println("Enter the array elements : ");
            array_values[i] = scan.nextInt();
        }


        // Iterating array elements
        for(int i=0; i < array_values.length; i++)
        {
            // Declaring count
            int count = 0;
            // j=i means 0 - 12
            //           1 - 12
            int j=i;

            // Then iterating the array elements !
            for(j=i; j < array_values.length; j++)
            {
                // Then counting the array element counts 
                // If the element == 0 . The count will be increment
                if(array_values[j] == 0)
                {
                    count++;
                }
                // If the element == 1 . The count will be decrement
                else if(array_values[j] == 1)
                {
                    count--;
                }

                // So if the array elements 0,1 are equal the count will be 0
                if(count == 0)
                {
                    // Then checking the previous count for we need long count
                    if(j-i >= previous_count)
                    {
                        // If the previous count less than j-i, updating the new long count values into that previos count
                        previous_count = j-i;
                        large_from = i;
                        large_to = j;
                    System.out.println("from : "+ large_from + " to : "+large_to + " difference : "+ previous_count);

                    }
                    // Output
                    // System.out.println("from : "+ large_from + " to : "+large_to + " difference : "+ previous_count);

                }

            }


            
        }
        // Printing the final result 
        // System.out.println("from : "+ large_from + " to : "+large_to + " difference : "+ previous_count);
    
    }
}
