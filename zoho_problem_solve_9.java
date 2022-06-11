import java.util.*;

public class zoho_problem_solve_9 {
    public static void main(String args[])
    {
        // String name = "SARAVANAN";
        // String name = "KARTHICK";
        String name = "ROWDYBABY";



        /*
        // Method - 1 
        HashSet<String> hashSet = new HashSet<>();

        // adding the elements into the set
        for(int i =0; i < name.length(); i++)
        {
            hashSet.add(String.valueOf(name.charAt(i)));
        }


        // Printing the hashset
        for (String ele : hashSet) {
            // Print HashSet data
            // Count variable
            int count = 0;

            for(int i=0; i < name.length(); i++)
            {
                // Comparing
                if(ele.equals(String.valueOf(name.charAt(i))))
                {
                    // If matched increse the count 
                    count++;
                }
            }

            // Then finaly printing the count valus with variable
            System.out.println(ele + " - "+ count );
        }

*/



        // METHOD -2 
        // Creating dynamic memory in string data type
        LinkedList <String> linkedList_values = new LinkedList<>();


        // Adding the values into that list from string
        for(int i=0; i < name.length(); i++)
        {
            linkedList_values.add(String.valueOf(name.charAt(i)));

            if(i == name.length())
            {
                linkedList_values.add(null);
            }
        }


        // Sorting the Lists
        Collections.sort(linkedList_values);
        System.out.println(linkedList_values);

        // Declaring count variable
        int count = 1;
        for(int i =0; i < linkedList_values.size() ; i++ )
        {
            try{
                // Counting how many values is same 
                if(linkedList_values.get(i).equals(linkedList_values.get(i+1)))
                {
                    count++;
                }
                // If the values are not same it print the counts and value
                else
                {
                    System.out.print(linkedList_values.get(i) + " - "+ count);
                    count = 1;
    
                }
                System.out.println();
            }
            catch(Exception e)
            {
                System.out.print(linkedList_values.get(i) + " - "+ count);

            }
        }







/*
        // Method - 3
        // Creating dynamic memory in string data type
        LinkedList <String> linkedList_values = new LinkedList<>();
        LinkedList <String> linkedList_visited = new LinkedList<>();

        // Adding the values into that list from string
        for(int i=0; i < name.length(); i++)
        {
            linkedList_values.add(String.valueOf(name.charAt(i)));     
        }



        // Iterating the elements from the linkedlist_values 
        for(int i=0; i < linkedList_values.size(); i++)
        {
            int count = 0;
            // Checking the element is already visited !
            if(linkedList_visited.contains(linkedList_values.get(i)))
            {

            }
            else
            {
                // If not visited means adding the elemet to linkedlist_visited list
                linkedList_visited.add(linkedList_values.get(i));

                // Iterating the elements from the linkedlist_values for comparing
                for(int j=0; j < linkedList_values.size(); j++)
                {
                    // Comparing all values
                    if(linkedList_values.get(i).equals(linkedList_values.get(j)))
                    {
                        count++;
                    }
                }


                // Printing the values
                System.out.println(linkedList_values.get(i) + " - "+ count);
            
                // Removing the i the value from the list. bcz we don't need to again check the element.
                // linkedList_values.remove(i);

}
        } 


        System.out.println(linkedList_values);

        */


    }
}
