public class zoho_problem_solve_11 {
    public static void main(String args[])
    {
        // Inpput 
        // String name = "KAVINNRAO";
        // String name = "ZOHO";
        String name = "ROWDYBABY";


        // OOPS creating object
        MySmallMethods myMethods = new MySmallMethods();
        // Calling the method in created object
        // Avoided .length()
        int length =  myMethods.String_lengths(name);


        // Converting String to char Array
        // Avoided toCharArray()
        char name_char[] = new char[length];

        for(int i=0; i < length; i++)
        {
            name_char[i] = name.charAt(i);
        }

        // Sorting the Array
        myMethods.Sort_Char_Array(name_char, length);
      

        // Printing the arrays
        MySmallMethods.Print_Char_Array(name_char, length);
       

        int count = 1;
        // Counting the repeated values 
        for(int i=0; i < length; i++)
        {
            try {

                // Comparing if the both values are same print count. Untill increment the count values
                if(myMethods.Ascii_calculation(name_char[i]) != myMethods.Ascii_calculation(name_char[i+1]))
                {
                    System.out.println(name_char[i] + " - "+ count);
                    count = 1;
                }
                else
                {
                    count++;
                }
            } catch (Exception e) {
                System.out.println(name_char[length-1] + " - "+ count);
            }
        }

    }   
}

class MySmallMethods{

    public static void Print_Char_Array(char[] array, int length)
    {
        for(int i=0; i < length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Sorting the char array method
    static char[] Sort_Char_Array(char[] array, int length)
    {
        // Creatin object
        MySmallMethods myMethods = new MySmallMethods();
          // Sorting the array
          for(int i=0; i<length-1; i++)
          {
              for(int j=i+1; j < length; j++)
              {
                //   Comparing ASCII based array !
                  char temp;
                  if(myMethods.Ascii_calculation(array[i]) > myMethods.Ascii_calculation(array[j]))
                  {
                    //   Swapping the elements
                      temp = array[j];
                      array[j] = array[i];
                      array[i] = temp;
                  }
              }
          }
        return array;
    }

    // Ascii Calculation method
    static int Ascii_calculation(int values)
    {
        return (values - 65);
    }
    // This method will retuen the string length
    static int String_lengths(String values)
    {
        char char_array[] = values.toCharArray();
        int i = 0;
        int count = 0;


        while(true)
        {
           try{
                if(char_array[i] != -1)
                {
                    count++;
                }
                else
                {
                    break;
                }
                i++;
           }
           catch(Exception e)
           {
                break;
           }
        }
        return count;
    }
}


/*
 0.103s, 12220KB 12.22MB
A B B D O R W Y Y 
A - 1
B - 2
D - 1
O - 1
R - 1
W - 1
Y - 2


*/