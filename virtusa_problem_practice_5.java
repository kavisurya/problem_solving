// Count triplets

public class virtusa_problem_practice_5 {
    public static void main(String[] args) {
        // String values= "1 2 3 4 5";
        String values = "2 6 3 9";
        String array_values[] = values.split(" ");
        int array[] = new int[array_values.length];


        // iterating from string to int
        for(int i=0; i < array_values.length; i++)
        {
            array[i] = Integer.valueOf(array_values[i]);
        }


        int count = 0;
        // iterating from string to int
        for(int i=0; i < array_values.length; i++)
        {
            for(int j=i+1; j < array.length; j++)
            {
                if(values.contains(String.valueOf(array[i] + array[j])))
                {
                    count++;
                }
            }
        }
        

        System.out.println(count);
    }
}
