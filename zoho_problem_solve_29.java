public class zoho_problem_solve_29 {
    public static void main(String[] args) {
        
        System.out.println("Started !");

        int array[] = {5,8,10,13,6,2};
        int total = 0;
        int n_divide_by = 3;

        // Iterating the array elements
        for(int i=0; i < array.length; i++)
        {

            // Intaialing the temp values
            int temp_store = 0;
            int j = 1;

            // Iterating while the theree like n_divisible_by varialble reaches
            while(true){

                // If the j value equal or greter than 
                // Like for 5
                // 1 * 3 = 3, 2*3 = 6
                // For 8
                // 1*3 = 3, 2*3=6, 3*3=9  
                if(array[i] <= temp_store)
                {
                    // counting the j values 
                    total = total + (j-1);
                    System.out.println("For "+array[i]+" : j value  "+j);
                    break;
                }

                temp_store = j * n_divide_by;
                // Its like 1*3,2*3,3*3 untill the array element value reaches!
                j++;
                
            }
        }


        // Finally printing the total values
        System.out.println("Total Thrshold : "+total);


    }
}


// Started !
// For 5 : j value  3
// For 8 : j value  4
// For 10 : j value  5
// For 13 : j value  6
// For 6 : j value  3
// For 2 : j value  2
// Total Thrshold : 17
