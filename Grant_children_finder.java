public class Grant_children_finder {
    public static void main(String[] args) {

        String list_of_relatives[][] = {
                { "luke", "shaw" },
                { "wayne", "rooney" },
                { "rooney", "ronaldo" },
                { "shaw", "rooney" }
        };

        // String name = "ronaldo";
        String name = "rooney";

        
        int count =0;
        for(int i=0; i < list_of_relatives.length;i++)
        {

            if(list_of_relatives[i][1].equals(name))
            {
                String Sec_name = list_of_relatives[i][0];
                
                for(int j=0; j < list_of_relatives.length; j++)
                {
                    // System.out.println(list_of_relatives[j][1]);

                    if(list_of_relatives[j][1].equals(Sec_name))
                    {

                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
