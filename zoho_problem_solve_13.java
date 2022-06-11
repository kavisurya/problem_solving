import java.util.*;

public class zoho_problem_solve_13 {
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = scan.nextLine();

        // String name = "ZOOHO";
        
        // Storing the values into list
        for(int i =0; i < name.length(); i++)
        {
            // The values will be object
            new FindFrequency(name.charAt(i));

        }

        
        // Creating the object
        FindFrequency findFrequency = new FindFrequency();

        // Printing the linkedlist object
        for(int i =0; i < findFrequency.list.size() ; i++)
        {

            System.out.print(findFrequency.list.get(i) + " ");
        }

        // Sorting
        findFrequency.Sort();

        System.out.println();

        // Declaring count variable
        int count = 1;
        for(int i =0; i < findFrequency.list.size() ; i++ )
        {
            try{
                // Counting how many values is same 
                if(findFrequency.list.get(i).equals(findFrequency.list.get(i+1)))
                {
                    count++;
                }
                // If the values are not same it print the counts and value
                else
                {
                    System.out.print(findFrequency.list.get(i) + " - "+ count);
                    System.out.println();
                    count = 1;
    
                }
            }
            catch(Exception e)
            {
                System.out.print(findFrequency.list.get(i) + " - "+ count);

            }
        }







    }
}


class FindFrequency{
    static LinkedList <Character> list = new LinkedList<>();
    FindFrequency(char value)
    {
        list.add(value);
    }

    FindFrequency(){}

    void Sort()
    {
        Collections.sort(list);   
    }

}


