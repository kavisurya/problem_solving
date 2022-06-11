public class college_classess_18 {
    public static void main(String[] args) {
        
        // int array[] = {1,2,3,3};
        int array[] = {1,5};

        int total = 0;

        for(int i=0; i < array.length/2; i++)
        {
            total = total + array[i];
        }
        

        if(total == array[total])
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
