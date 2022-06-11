import java.util.*;

public class college_classess_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String name :");
        String input_values = scan.nextLine();

        int calc = (int) input_values.charAt(input_values.length()-1) - 96 ;
        System.out.println((calc*2)-1);

    }
}
