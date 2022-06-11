import java.util.*;

public class zoho_problem_solve_12 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = input.nextInt();
        // Declaring the array
        int array[][] = new int[n][n];

        // Getting the inputs to the array! from the user
        System.out.print("Enter the Elements");
        for(int i=0; i <n; i++)
        {
            for(int j=0; j < n ; j++)
            {
                System.out.println("Enter the Elements value : ");
                array[i][j] =  input.nextInt();
            }
        }
        
        // Finding the total length for result for upper 
        int total = 0;
        for(int i=n; i > 0; i--)
        {
            total = total+i;
        }

        // Checking upper & lower triangle
        int count = 0;
        int count_lower = 0;

        // Finding the total length for result for lower 
        int count_total = ((n*n) - n) / 2;

        // Its for break identification
        int exitloop= 0;

        // Iterating the array row
        for(int i=0; i <n;i++)
        {
            if(exitloop == 1)
            {
                break;
            }
            else
            {
                // Iterating the array column
                for(int j=0; j < n; j++)
                {
                    // Checking if the array[0][0] || array[n-1][n-1] == 0 its not a triangle
                    if(array[0][0] == 0 || array[n-1][n-1] == 0)
                    {
                        exitloop = 1;
                        break;
                    }
                    // If not the else part will work
                   else
                   {
                        // If the elements not equal to 0 the count will be increment   
                        if(array[i][j] !=0)
                        {
                            count++;
                        }
                        // If the elements equal to 0 the count_lower will be increment   

                        else
                        {
                            count_lower++;
                        }
                        System.out.print(array[i][j]+ " ");
                   }
                }
                System.out.println();
            }
           
        }




        // Comparing if total equal to count
        if(count_lower == count_total  && (array[0][1] == 0))
        {
            System.out.println("Upper triangle");
        }

        // Comparing if total equal to count_ower
        else if(count == total && (array[1][0] == 0))
        {
            System.out.println("Lower triangle");
        }
        // If not both are satisfied not a 
        else
        {
            System.out.println("Not triangle");
        }
    


// End of the program














        // int n=8;
        // String temp = "";
        
        // if(n%2 == 0)
        // {
        //     for(int i=0; i <= n/2; i++)
        //     {
        //         System.out.print(i+ ",");
        //         temp = temp + String.valueOf(i+ ",");
        //     }
        //     System.out.print("  ");
        //     System.out.println(temp);
        // }
        // else
        // {
        //     System.out.println("Odd cannot accept");
        // }
        

    }
}


// 2d matrix Array
        // int n = 3;
        // Upper triangle
        // int array[][] = {
        //     {18,2,3,42},
        //     {0,5,8,7},
        //     {0,0,81,9},
        //     {0,0,0,11}
        // };


        // int array[][] = {
        //     {1,2,3},
        //     {4,0,8},
        //     {8,9,9}
        // };

        // int array[][] = {
        //     {18,2,3,42},
        //     {8,5,8,0},
        //     {4,5,0,0},
        //     {1,0,0,0}
        // };

        // Lower
        // int array[][] = {
        //     {0,0,0,0},
        //     {8,0,0,0},
        //     {4,5,0,0},
        //     {1,8,5,0}
        // };


        // int array[][] = {
        //     {18,2,3,42},
        //     {0,5,0,7},
        //     {0,0,81,9},
        //     {0,0,0,11}
        // };


        // System.out.println("Upper count : "+ count);
        // System.out.println("Lower count : "+ count_lower);
        // System.out.println("Count total : "+ count_total);
        // System.out.println("Total : "+ total);