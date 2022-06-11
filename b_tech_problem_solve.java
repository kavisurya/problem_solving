import java.util.*;

public class b_tech_problem_solve {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Getting user inputs
        System.out.println("Enter the N value : ");
        int n = scan.nextInt();


        int original_array[] = new int[n];
        int sorted_array[] = new int[n];


        for(int i=0; i < n; i++)
        {
            System.out.println("Enter Array elements : ");
            original_array[i] = scan.nextInt();
            sorted_array[i] = original_array[i];
        }


        // Sorting the array
        Arrays.sort(sorted_array);

        int count = 0;

        // Finding by rankwise
        for(int i=0; i < original_array.length; i++)
        {
            for(int j=0; j < original_array.length; j++)
            {
                if(sorted_array[i] == original_array[j])
                {
                    original_array[j] = ++count;
                    break;
                }
            }
        }


        // Finally printing the output

        for(int i=0; i < original_array.length; i++)
        {
            System.out.print(original_array[i]+ " ");
        }
        
    }
}
