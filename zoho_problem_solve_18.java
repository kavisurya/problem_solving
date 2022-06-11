import java.util.*;

public class zoho_problem_solve_18 {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        // int arr[] = {4,5,6,4,11,26,11,29,6};

        
        System.out.println("Enter the n : ");
        // getting input from the user
        int n = scan.nextInt();
        int arr[] = new int[n]; 
        for(int i =0; i < n; i++)
        {
            System.out.println("Enter the array elements : ");
            arr[i] = scan.nextInt();
        }


        // Sorting the array
        Arrays.sort(arr);

        // Checking the both array elements for repeating
        // like [4,4,5,6,6,11]
        for(int i=0; i < arr.length-1; i++)
        {
            int count = 1;

            if(arr[i] == arr[i+1])
            {
                count++;
            }
            if(count != 1)
            {
                System.out.println(arr[i] +" - "+ count);
            }
        }

    }
}
