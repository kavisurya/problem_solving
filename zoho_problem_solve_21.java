import java.util.*;

public class zoho_problem_solve_21 {
    public static void main(String[] args) {
        
        // int arr[] = {5,11,10,20,9,16,23 };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int length = scan.nextInt();
        int arr[] = new int[length];
        int arr_factors[] = new int[arr.length];


        for(int i=0; i < length; i++)
        {
            System.out.println("Enter the array elements : ");
            arr[i] = scan.nextInt();
        }


        // Finding factors
        for(int iter = 0; iter < arr.length; iter++)
        {
            int count = 0;
            for(int i=1; i <= arr[iter]; i++)
            {
                if(arr[iter]%i == 0)
                {
                    count++;
                }
            }
            arr_factors[iter] = count;
        }
        

        // Finding the max value iin factors count

        for(int j=0; j < arr.length; j++)
        {
            int index=0;
            int largest_num = -1;
            for(int i=0; i < arr.length; i++)
                {
                    if(arr_factors[i] != -1)
                    {
                        // Finding the largest num in that array elements
                        if(arr_factors[i] > largest_num)
                        {
                            largest_num=arr_factors[i];
                        }
                        // Finding the largest array index
                        if(arr_factors[i] == largest_num)
                        {
                            index = i;
                        }
                    }
                }
    
                System.out.println(largest_num+ " = " + arr[index]);
                // Once we visited that array we change the values to -1
                arr_factors[index] = -1;
    
        }


        // Printing the final array values
    //     for(int i=0; i < arr.length; i++)
    //     {
    //         System.out.print(arr_factors[i]+ " ");
    //     }
    }
}
