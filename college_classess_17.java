import java.util.*;

public class college_classess_17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = scan.nextInt();


        int array[] = new int[n];

        // Getting inputs from the user
        int index = 0;
        int total_zeros = 0;
        for(int i=0; i < n; i++)
        {
            System.out.println("Enter the array elements : ");
            int temp = scan.nextInt();
            if(temp >= 0)
            {
                array[index++] = temp;
            }
            else
            {
                total_zeros++;
            }
        }


        // Sorting the array
        Arrays.sort(array);
        int start = array[total_zeros];


        // Iterating the elemenst
        // [0,0,0,1,3]
        // start from 2 nd index

        for(int i=total_zeros; i <= n; i++)
        {
            if(i >= n)
            {
                System.out.println("Missing no is : "+start);
                break;
            }
            else
            {

                if(array[i] == start)
                {
                    //Nothing 
                }
                else
                {
                    System.out.println("Missing no is : "+start);
                    break;
                }
            }
            start++;
        }
    }
}



// Enter the N value : 
// 5
// Enter the array elements : 
// -5
// Enter the array elements : 
// 0
// Enter the array elements : 
// 1
// Enter the array elements : 
// 2
// Enter the array elements : 
// -3
// Missing no is : 3


// └──╼ $java college_classess_17.java
// Enter the N value : 
// 5
// Enter the array elements : 
// 1
// Enter the array elements : 
// 2
// Enter the array elements : 
// 3
// Enter the array elements : 
// 4
// Enter the array elements : 
// 5
// Missing no is : 6
