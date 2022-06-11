import java.lang.reflect.Array;
import java.util.*;

public class college_classess_14 {
    public static void main(String[] args) {
        
       // Getting inputs from the user
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the array size of an element : ");
       int n = scan.nextInt();
       int array[] = new int[n];
       HashSet<Integer> hashSet = new HashSet<>();
       for(int i=0; i < n ;i++)
       {
           System.out.println("Enter the array elements : ");
           array[i] = scan.nextInt();
           hashSet.add(array[i]);
       }

       int removed_duplicates_length = hashSet.size();
       int removed_dups_array[] = new int[removed_duplicates_length];
       int repeated_dups_array[] = new int[removed_duplicates_length];
       
        //Sorting the array
        Arrays.sort(array);

        //    Finding the repeaded valuse

        int count = 1;
        int index = 0;
        for(int i=0; i < array.length; i++)
        {
            if(array.length - 1 == i)
            {
                removed_dups_array[index] = array[i];
                repeated_dups_array[index] = count;
            }
            else
            {

                if(array[i] == array[i+1])
                {
                    count++;
                }
                else
                {
                    removed_dups_array[index] = array[i];
                    repeated_dups_array[index] = count;

                    index++;
                    count = 1; 
                }
            }

        }


        // Finding the frequesncy of the program
        // By using swap method

        for(int i=0; i < removed_duplicates_length; i++)
        {
            int temp = 0;
            int temp2 = 0;
            for(int j=i; j < removed_duplicates_length; j++)
            {
                if(repeated_dups_array[i] < repeated_dups_array[j])
                {
                    temp = repeated_dups_array[j];
                    temp2 = removed_dups_array[j];

                    repeated_dups_array[j] = repeated_dups_array[i];
                    removed_dups_array[j] = removed_dups_array[i];

                    repeated_dups_array[i] = temp;
                    removed_dups_array[i] = temp2;
                }
            }
        }

        // Printing the arrays:
        for(int i=0; i < removed_duplicates_length; i++)
        {
            for(int j=0; j <  repeated_dups_array[i]; j++)
            {
                System.out.print(removed_dups_array[i]+" ");
            }
        }


    }
}



// Enter the array size of an element : 
// 5
// Enter the array elements : 
// 9
// Enter the array elements : 
// 9
// Enter the array elements : 
// 9
// Enter the array elements : 
// 2
// Enter the array elements : 
// 5
// 9 9 9 5 2 



// Enter the array size of an element : 
// 10
// Enter the array elements : 
// 9
// Enter the array elements : 
// 9
// Enter the array elements : 
// 9
// Enter the array elements : 
// 9
// Enter the array elements : 
// 2
// Enter the array elements : 
// 2
// Enter the array elements : 
// 5
// Enter the array elements : 
// 1
// Enter the array elements : 
// 1
// Enter the array elements : 
// 1
// 9 9 9 9 
// 1 1 1 
// 2 2 
// 5