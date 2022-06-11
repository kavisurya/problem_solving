public class zoho_problem_solve_20 {
    public static void main(String[] args) {
        

        int array1[] = {1,1,4,7};
        int array2[] = {23,6,3,1};
        int result_array[] = new int[array1.length+array2.length];
       
        int temp_array_val = 0;

        int temp = 0;
        int result_array_index = 0;
        int ascending = 0;
        int decending = 0;



        // Checking array1 is asc/desc
        if(array1[0] > array1[1])
        {
            for(int i=array1.length-1; i > 0;i--)
            {
                result_array[result_array_index] = array1[i];
                result_array_index++;
            }
        }
        else
        {
            for(int i=0; i < array1.length;i++)
            {
                result_array[result_array_index] = array1[i];
                result_array_index++;
            }

        }




        if(array2[0] > array2[1])
        {
            for(int i=array2.length-1; i >= 0;i--)
            {

                result_array[result_array_index] = array2[i];
                result_array_index++;
            }
        }
        else
        {

            for(int i=0; i < array2.length;i++)
            {
                
                result_array[result_array_index] = array2[i];
                result_array_index++;
            }
        }

    


        for(int prints=0; prints < result_array.length; prints++)
        {
            System.out.print(result_array[prints]+ " ");
        }
        System.out.println();













        for(int i=0; i < result_array.length; i++)
        {


            // When array1 length is equal to i
            if(array1.length == i)
            {
                temp=0;
            }
            // Appendig the 1st array into result array
            if(array1.length > i)
            {
                
            }
            // Appendig the 2nd array into result array
            else
            {
                
                
            }
            

            temp++;

                
            
        }

       
        
    }
}
