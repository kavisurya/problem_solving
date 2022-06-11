public class college_classess_2 {
    public static void main(String[] args) {
        
        int n = 4;
        int flag1 = 0;
        int flag2 = 0;

        for(int i=2; i < n-1; i++)
        {
            if(((n-1) % i) == 0)
            {
                flag1 = 1;
                break;
            }

        }

        for(int i=2; i < n+1; i++)
        {
            if((n+1)% i == 0)
            {
                flag1 = 1;
                break;
            }

        }

        if(flag1 == 0 && flag2 == 0)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }
    }
}
