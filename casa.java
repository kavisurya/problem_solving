import java.util.*;
public class casa {
    public static void main(String[] args) {
     
        int destination_position = 0, no_of_cars = 0;
        Scanner scan = new Scanner(System.in);

        destination_position = scan.nextInt();
        no_of_cars = scan.nextInt();


        float p[] = new float[no_of_cars];
        float s[] = new float[no_of_cars];
        float ti,di,gt = 0;


        for(int i=0; i < no_of_cars; i++)
        {
            p[i] = scan.nextFloat();
            s[i] = scan.nextFloat();
        }


        for(int i=0; i < no_of_cars; i++)
        {
            di = destination_position - p[i];
            ti = di / s[i];

            if(gt < ti)
            {
                gt = ti;
            }
        }


        System.out.println("ans : "+(double)(destination_position/gt));

    }
}
