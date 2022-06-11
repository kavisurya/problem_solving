public class pattern_print_1_zoho {
        public static void main(String args[])
        {
            int n=8;
            int temp = n;

            //Creating 
            StringBuffer st = new StringBuffer();

            //Iterating
            for(int row=0;row<n;row++)
            {
                //Appendign values
                st.append(row+1);

                for(int column=0; column < temp-1; column++)
                {
                    //Prining Space
                    System.out.print(" ");
                }  

                //Printing Values
                System.out.print(st.reverse());
                st.reverse();
                temp--;

                System.out.println();
            }


        }
}
