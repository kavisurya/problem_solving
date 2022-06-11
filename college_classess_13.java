import java.util.*;

public class college_classess_13 {
    public static void main(String[] args) {
        
            // Getting inputs from the user
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the array size of an element : ");
            int n = scan.nextInt();
    
            int array[] = new int[n];
    
            for(int i=0; i < n ;i++)
            {
                    System.out.println("Enter the array elements values : ");
                    array[i] = scan.nextInt();
            }
    

            // Finding the no of swaps

            int count = 0;
            for(int i=0; i <n-1; i++)
            {
                if(array[i] > array[i+1])
                {
                    // Nothing
                }
                else
                {
                    count++;
                }
            }

            System.out.println("Total no of swaps : "+ count);
    }
}

// Enter the array size of an element : 
// 5
// Enter the array elements values : 
// 10
// Enter the array elements values : 
// 19
// Enter the array elements values : 
// 6
// Enter the array elements values : 
// 3
// Enter the array elements values : 
// 5
// Total no of swaps : 2
// ┌─[kavinnrao@baby]─[~/Desktop/c]
// └──╼ $java college_classess_13.java
// Enter the array size of an element : 
// 4
// Enter the array elements values : 
// 2
// Enter the array elements values : 
// 8
// Enter the array elements values : 
// 5
// Enter the array elements values : 
// 4
// Total no of swaps : 1
// ┌─[kavinnrao@baby]─[~/Desktop/c]
// └──╼ $java college_classess_13.java
// Enter the array size of an element : 
// 4
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 2
// Enter the array elements values : 
// 3
// Enter the array elements values : 
// 4
// Total no of swaps : 3
