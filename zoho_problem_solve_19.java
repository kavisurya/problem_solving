import java.lang.reflect.Array;
import java.util.Arrays;

public class zoho_problem_solve_19 {
    public static void main(String[] args) {
        

        int array1[] = {1,1,4,7};
        int array2[] = {23,6,3,1};
        int result_array[] = new int[array1.length+array2.length];

        int temp_array_val = 0;

        int temp = 0;
        int result_array_index = 0;
        for(int i=0; i < result_array.length; i++)
        {
            int flag = 0;

            // When array1 length is equal to i
            if(array1.length == i)
            {
                temp=0;
            }
            // Appendig the 1st array into result array
            if(array1.length > i)
            {
                // Removing the duplicates 
                for(int m=0; m < i; m++)
                {
                    // Its checking whethre the insering element alrady present in result_array
                    if(array1[temp] == result_array[m])
                    {
                       
                        // If present the flag will be zero
                        flag = 1;
                    }
           
                    
                }

                if(flag == 0)
                {
                    result_array[result_array_index] = array1[temp];
                    result_array_index++;
                }

            }
            // Appendig the 2nd array into result array
            else
            {
                // array2 index should be starts from 0 for iterate
                // Removing the duplicates 
                for(int m=0; m < i; m++)
                {
                    // if(result_array[m] == 0 || result_array[m+1] == 0)
                    // {
                    //     break;
                    // }
                    // Its checking whethre the insering element alrady present in result_array
                    if(array2[temp] == result_array[m])
                    {
                        // If present the flag will be zero
                        flag = 1;
                    }
                    // Sorting
                    // if(result_array[m] > result_array[m+1])
                    // {
                    //     temp_array_val = result_array[m+1];
                    //     result_array[m+1] = result_array[m];
                    //     result_array[m] = temp_array_val;
                    // }

                }

                if(flag == 0)
                {
                    result_array[result_array_index] = array2[temp];
                    result_array_index++;
                }

            }
            

            temp++;

                
            for(int prints=0; prints < result_array.length; prints++)
            {
                System.out.print(result_array[prints]+ " ");
            }
            System.out.println();
        }
        Arrays.sort(result_array);

        for(int i=0;  i < result_array.length; i++)
        {
            if(result_array[i] != 0)
            {
                System.out.print(result_array[i]+ " ");
            }
        }
        
    }
}
