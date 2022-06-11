import java.util.Arrays;

public class zoho_problem_solve_15 {
    public static void main(String[] args) {

        String name = "KAVISURYA";

        
        FindFrequency findFrequency = new FindFrequency(name.length(), 0);
        FindFrequency findFrequency1 = new FindFrequency();

        // Storing the values into list
        for(int i =0; i < name.length(); i++)
        {
            // The values will be object
            findFrequency1.Add(name.charAt(i));
        }

        // Sorting
        
        findFrequency1.Sort(findFrequency1.arr);

         // Printing
         for(int i =0; i < name.length(); i++)
         {
             // The values will be object
            System.out.print(findFrequency1.arr[i] +" ");
        }


        System.out.println();
        int count = 1;
        for(int i =0; i < findFrequency1.arr.length ; i++ )
        {
            int j = 0;

            // This conditin for handling the error
            if(i == findFrequency1.arr.length - 1)
            {
                j=i-1;
            }
            else
            {
                j=i+1;
            }
             // Counting how many values is same 
             if(findFrequency1.arr[i] == (findFrequency1.arr[j]))
             {
                 count++;
             }
             // If the values are not same it print the counts and value
             else
             {
                 System.out.print(findFrequency1.arr[i] + " - "+ count);
                 System.out.println();
                 count = 1;
 
             }

        }


    }
}



class FindFrequency{
    static char arr[];
    int size;
    int increment;

    FindFrequency(int size, int increment)
    {
        this.arr = new char[size];
        this.increment = increment;
    }

    FindFrequency(){}

    void Add(char elements)
    {
        arr[increment] = elements;
        increment++; 
    }

    void Sort(char array[])
    {
        Arrays.sort(array);
    }
}