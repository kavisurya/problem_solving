//gcd

public class test {
    int a = 60;
    int b = 48;
    public static void main(String[] args) {
        
        test tt= new test();
        tt.gcd(tt.a, tt.b);
    }

    public void gcd(int a, int b)
    {
        if(b==0)
        {
            System.out.println(a);
            test tt = new test();
            // System.out.println(tt.a);
            System.out.println("LCM of : "+(tt.a*tt.b)/a);
        }
        else
        {
            gcd(b, a%b);
        }
    }

}
