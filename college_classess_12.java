
import java.util.*;
public class college_classess_12 {
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


        // Finding the equals
        int total = 0;
        for(int i=0; i < n; i++)
        {
            int count = 0;
            for(int j=i; j < n; j++)
            {
                if(array[j] == 1)
                {
                    count++;
                }
                else
                {
                    count--;
                }
                if(count == 0)
                {
                    total++;
                }
            }
        }


        System.out.println(total);
    }
}

// Finding the equal 0 and 1

// Enter the array size of an element : 
// 7
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 0
// Enter the array elements values : 
// 0
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 0
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 1
// 8
// ┌─[kavinnrao@baby]─[~/Desktop/c]
// └──╼ $java college_classess_12.java
// Enter the array size of an element : 
// 5
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 1
// Enter the array elements values : 
// 0
// 1
