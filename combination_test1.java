import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

class test{
    public static void main(String[] args) {
        
        StringBuffer stringBuffer = new StringBuffer("123");
        StringBuffer stringBuffer1 = new StringBuffer();

        HashSet <String> remove_duplicate = new HashSet<>();

        String temp = "";
        String temp1 = "";
    
        int count = 0;

        for(int i=0; i  < stringBuffer.length(); i++)
        {
            stringBuffer1.append(stringBuffer.substring(1, stringBuffer.length()));

            // System.out.println(++count+" "+stringBuffer);


            remove_duplicate.add(stringBuffer.toString());
            remove_duplicate.add(stringBuffer.reverse().toString());
            stringBuffer.reverse();

            for(int j=0; j < stringBuffer1.length(); j++ )
            {

                
                remove_duplicate.add(stringBuffer.charAt(0) +""+ stringBuffer1.toString());
                remove_duplicate.add(stringBuffer1.toString()+""+stringBuffer.charAt(0));

                remove_duplicate.add(stringBuffer1.reverse().toString() +""+stringBuffer.charAt(0));
                remove_duplicate.add(stringBuffer.charAt(0)+stringBuffer1.reverse().toString());

                // System.out.println(++count+" "+stringBuffer.charAt(0) +""+ stringBuffer1);
                // System.out.println(++count+" "+stringBuffer1.reverse() +""+stringBuffer.charAt(0));
                
                temp1 = String.valueOf(stringBuffer1.charAt(0));
                stringBuffer1.delete(0,1);
                stringBuffer1.append(temp1);
                
            }
            stringBuffer1.delete(0, stringBuffer1.length());
            temp = String.valueOf(stringBuffer.charAt(0));
            stringBuffer.delete(0,1);
            stringBuffer.append(temp);


        }


        for(String a: remove_duplicate)
        {
            System.out.println(++count+" "+ a);
        }
    }
}