
import java.util.*;
// Left Palindrome is  : 101
// Given Palindrome is  : 105
// right Palindrome is  : 111

class Nearest_panlindrome {

    public static void main(String args[]) {
        int a = 105;
        int left = 0, right = 0;

        for (int i = a; left == 0; i--) {

            String temp = String.valueOf(i).toLowerCase();
            String temp1 = "";
            for (int j = temp.length() - 1; j >= 0; j--) {
                temp1 += temp.charAt(j);
            }

            if (temp.equals(temp1)) {
                left = i;
                System.out.println("Left Palindrome is  : " + left);
                break;
            }
        }

        System.out.println("Given Palindrome is  : " + a);

        for (int i = a; right == 0; i++) {

            String temp = String.valueOf(i).toLowerCase();
            String temp1 = "";
            for (int j = temp.length() - 1; j >= 0; j--) {
                temp1 += temp.charAt(j);
            }

            if (temp.equals(temp1)) {
                left = i;
                System.out.println("right Palindrome is  : " + left);
                break;
            }
        }

    }

}