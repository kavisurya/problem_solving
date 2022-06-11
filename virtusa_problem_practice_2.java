public class virtusa_problem_practice_2 {
    public static void main(String[] args) {
        
        int a = 0, b = 1,n=50;
        System.out.print(a+" "+b+" ");
        virtusa_problem_practice_2 Fabb = new virtusa_problem_practice_2();
        Fabb.Fabbi(a,b,n-2);



    }


    void Fabbi(int a,int b,int n)
    {

        if(n==0)
        {
            return;
        }
        else
        {
            System.out.print(a+b+" ");
            Fabbi(b, a+b, --n);
        }
    }
    
}
