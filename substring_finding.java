// Input: s1 = "for", s2 = "geeksforgeeks"
// Output: 5
// Explanation:
// String "for" is present as a substring
// of s2.

import java.util.*;

public class test {

    public static void main(String[] args) {
       String a = "ao";
       String b = "kavinnrao";

       for(int i=0; i < b.length()-a.length()+1; i++)
       {
           String temp = "";

        //    System.out.println(i);

           for(int j=i; j < a.length()+i; j++)
           {
                temp = temp + String.valueOf(b.charAt(j));
                // System.out.println(temp);
                // System.out.println(i);

                if(a.equals(temp))
                {
                    System.out.println((j-a.length()+1)+" to "+ j);
                }
                else
                {
                    // System.out.println(temp);
                }
           }
       }






    }

}
// Iterator iter_remove = remove_duplicate.iterator();

// while(iter_remove.hasNext())
// {
// System.out.print(iter_remove.next()+" ");
// }