import java.util.LinkedList;

public class zoho_problem_solve_8 {
    public static void main(String[] args) {
        int n = 5;

        // for(int i=0; i <n;i++)
        // {
        // for(int j=0; j < i+1; j++)
        // {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // StringBuffer stringBuffer = new StringBuffer();
        // StringBuffer stringBuffer_space = new StringBuffer();

        // for(int i=0-n; i <n;i++)
        // {
        // if(i >=0)
        // {
        // stringBuffer.append(i+1);
        // System.out.print(stringBuffer_space.substring(0,
        // stringBuffer_space.length()-i));
        // System.out.print(stringBuffer);

        // for(int j=0; j <= i+1; j++)
        // {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // else
        // {
        // stringBuffer_space.append(" ");
        // }

        // }

        // String str_reverse = "";
        // LinkedList <String> linkedList = new LinkedList<>();
        // for(int i=0-n; i <n;i++)
        // {
        // String str = "";

        // if(i >=0)
        // {

        // for(int j=1; j <= i+1; j++)
        // {
        // str = str + String.valueOf(j);
        // }

        // linkedList.add(str);

        // // Reversing
        // System.out.print(linkedList.get(linkedList.size()-1)+"0"+str);
        // System.out.println();
        // }
        // else
        // {

        // }

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < n; i++) {

            int count_reduce = 4;
            int temp_store = 0;

            System.out.print(i+1 + " ");

            for (int j = 1; j < i + 1; j++) {

                temp_store = temp_store+ i + 1+ count_reduce;


                System.out.print(temp_store + " ");

                count_reduce--;
            }

            System.out.println();

        }
    }
}
