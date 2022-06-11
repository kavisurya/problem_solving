import java.util.*;

public class zoho_problem_solve_14 {
    public static void main(String args[])
    {
        // // Array
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the n : ");
        // int len_of_arr = scan.nextInt();

        // // getting input elements from the user

        // int array[] = new int[len_of_arr];

        // for(int i=0;i<len_of_arr;i++)
        // {
        //     System.out.println("Enter the element values : ");
        //     array[i] = scan.nextInt();
        // }

        // System.out.println("Enter the n split up : ");
        // int n = scan.nextInt();

        int n=6;
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // int array[] = {1,2,3,4,5,6};

        int copy_n = n;
        int i=0, j=0;

       
            // Iterating the loop element by reverse and incrementing the i = i + n
            for(i=0; i < array.length ; i= i+n)
            {
                int temp = 0;
                // checking the array length and i for array outofboundException
                if(array.length -1 > i)
                {
                    // i th val 0 6  12,18
                    // copy_n   6 12 18
                    for(int from=i; from < copy_n-1;from++)
                    {
                        // copy_n-1 = 12-1=11 
                        // from = ith val like : 11 > 6 them j=11,10,9,8,7
                        for(j=copy_n-1; j > from ; j-- )
                        {
                            // checking the array length and i for array outofboundException

                            if(j < array.length)
                            {
                                // Swapping into beforth index
                                temp = array[j];
                                array[j] = array[j-1];
                                array[j-1] = temp;
        
                            }
                            
                        }
                       
                    }
                    // counting the copy_n value += 6 
                    copy_n = copy_n + n;
    
                }
                
            }

            //Printing the value  
            for(int a : array)
                {
                    System.out.print(a + " ");
                }
                System.out.println();
    }
}
