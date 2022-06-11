public class zoho_problem_solve_24 {
    public static void main(String[] args) {
        
        StringBuffer stringBuffer = new StringBuffer("12345");
        StringBuffer stringBuffer1 = new StringBuffer();

        for(int i =0; i < stringBuffer.length(); i++)
        {
            System.out.println(stringBuffer);
            stringBuffer1.append(stringBuffer.substring(stringBuffer.length()-1)+stringBuffer.substring(0,stringBuffer.length()-1));
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(stringBuffer1);
            stringBuffer1.delete(0, stringBuffer.length());
        }
    }
}


// ABC
// CAB
// BCA
// ┌─[kavinnrao@baby]─[~/Desktop/c]
// └──╼ $java zoho_problem_solve_24.java
// 12345
// 51234
// 45123
// 34512
// 23451
