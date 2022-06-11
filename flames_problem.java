import java.util.*;

public class flames_problem {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //Getting user inputs
        HashSet hashSet = new HashSet<>();
        LinkedList linkedList = new LinkedList<>();

        System.out.println("Enter the 1st element : ");
        String men_name = scan.nextLine().toUpperCase();

        System.out.println("Enter the 2 nd element : ");
        String women_name = scan.nextLine().toUpperCase();

        String name = men_name + women_name;
        // Appending the element to that array
        for(int i=0;i<(men_name.length() + women_name.length()); i++)
        {
            hashSet.add(name.charAt(i));
            linkedList.add(name.charAt(i));
        }

        linkedList.add('z');
        System.out.println(hashSet);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);

        int count = 1;
        int increment_n = 0;
    
        try {
            for(int i=1; i < name.length(); i++)
            {
                if(linkedList.get(i).equals(linkedList.get(i+1)))
                {
                    count++;
                }
                else
                {
                    if(count > 1)
                    {
                        count = 1;
                    }
                    else
                    {
                        ++increment_n;
                        count = 1;
                    }
                }
    
            }
        } catch (Exception e) {
            //TODO: handle exception
            // ++increment_n;

        }
        System.out.println(increment_n);




    }
}

