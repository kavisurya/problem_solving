//gcd

public class test {
    public static void main(String[] args) {
        int a = 60;
        int b = 48;
        test tt= new test();
        tt.gcd(a, b);
    }

    public void gcd(int a, int b)
    {
        if(b==0)
        {
            System.out.println(a);
        }
        else
        {
            gcd(b, a%b);
        }
    }
}