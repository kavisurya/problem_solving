import java.util.*;

public class college_classess_11 {
    public static void main(String[] args) {
        
        // Getting inputs from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size of an element : ");
        int n = scan.nextInt();

        int array[][] = new int[n][n];
        int single_array[] = new int[n*n];


        int single_array_index = 0;
        for(int i=0; i < n ;i++)
        {
            for(int j=0; j < n; j++)
            {
                System.out.println("Enter the array elements values : ");
                array[i][j] = scan.nextInt();
                single_array[single_array_index++] = array[i][j];
            }
        }


        Arrays.sort(single_array);
        // Priinting the single array elements value
        for(int i=0; i < (n*n) ;i++)
        {
            System.out.print(single_array[i]+" ");                
        }



    }
}




// Enter the array size of an element : 
// 3
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 2
// Enter the array elements values : 
// 3
// Enter the array elements values : 
// 4
// Enter the array elements values : 
// 5
// Enter the array elements values : 
// 6
// Enter the array elements values : 
// 7
// Enter the array elements values : 
// 8
// Enter the array elements values : 
// 9
// 1 2 3 4 5 6 7 8 9 
