public class virtusa_problem_practice_3 {
    public static void main(String[] args) {
        

        // int array[] =   {-2, -3, 4, -1, -2, 1, 5, -3};
        int array[] =   {-5,2,1,-1,-2,8,15,-8};

        int max = array[0];

        for(int i=0; i < array.length; i++)
        {
            int sum = 0;
            for(int j=i; j < array.length; j++)
            {
                sum = sum + array[j];
                if(sum >= max)
                {
                    // System.out.println("From "+i+" to :"+j+" sum :"+sum);
                    max = sum;
                }
            }
        }

        System.out.println(max);

    }
}
