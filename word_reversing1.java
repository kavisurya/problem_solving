// Eg 1: Input: one two three
//       Output: eno owt eerht 
// Eg 2: Input: I love india
//       Output: I evol aidni

class word_reversing1{
    public static void main(String[] args)
    {
        String inpu = "I love india";
        String inputs[] = inpu.split(" ");

        for(String a: inputs)
        {
            for(int i=a.length()-1; i >= 0; i--)
            {
                System.out.print(a.charAt(i));
            }
            System.out.print(" ");
        }
    }
}