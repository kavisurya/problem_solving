import java.util.Scanner;

public class bill_system {
    public static void main(String[] args) {
    
        bill_system bill_system = new bill_system();
        Customer customer = new Customer();
        // System.out.println("User entered : "+ user_input);

        while(true)
        {
            int user_input = bill_system.show_lable();

        switch(user_input)
        {
            case 1:
            {
                customer.Create_user();
                break;
            }
            case 2:
            {
                
                break;
            }
            case 3:
            {
                
                break;
            }
            case 4:
            {
                // System.out.println("Increment vals : " + customer.increment);
                customer.Customer_list();
                break;
            }
            case 5:
            {
                
                break;
            }
            case 6:
            {
                
                break;
            }
            case 7:
            {
                
                break;
            }
            case 8:
            {
                
                break;
            }
            case 9:
            {
                
                break;
            }
            default:
            {
                System.out.println("Sorry the label not found !!");
            }
        }
    }

    }

    int show_lable()
    {
        // Creating scanner oblject for user input
        Scanner input = new Scanner(System.in);

        // Showing lables
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t\t\t\t-: LABELS :-");
        System.out.println("\t\t-----------------------------------------------------");

        System.out.println("\n\n\n\t\t-: 1) Customer Creation :-");
        System.out.println("\t\t-: 2) Item Creation :-");
        System.out.println("\t\t-: 3) Bill Creation :-");
        System.out.println("\t\t-: 4) Customer List :-");
        System.out.println("\t\t-: 5) Item List :-");
        System.out.println("\t\t-: 6) Bill List :-");
        System.out.println("\t\t-: 7) Using bills based on customer :-");
        System.out.println("\t\t-: 8) Bill detail based in bill number :-");
        System.out.println("\t\t-: 9) Total amount purchased by a customer :-");

        // Getting input from the user !
        int user_input = input.nextInt();

        return user_input;
    }
}



class Items
{
    int size = 10;
    String products[] = new String[size];
    int price[] = new int[size];
    int quantity[] = new int[size];
    int increment = 0;
    Items()
    {

    }

    void Create_items()
    {

    }
}


class Customer{
    int customer_id;
    String customer_name;
    String customer_mobile;

    Customer(int customer_id, String customer_name,String customer_mobile)
    {   
        this.customer_id = customer_id;
        this.customer_mobile = customer_mobile;
        this.customer_name = customer_name;
    }

    Customer(){}
    //Creating a user 
    void Create_user()
    {
        System.out.println("Creating a user !");

        // Getting user input
        Scanner scan = new Scanner(System.in);
        // Getting user's name
        System.out.print("Enter Your name : ");
        String name = scan.nextLine();

        // Getting user's mobile
        String mobile = scan.nextLine();
        new Customer(++this.customer_id, name, mobile);
    }


    // Showing all customer lists
    void Customer_list()
    {
        System.out.println("ID\t\tNAME\t\tMOBILE");

        for(int i=0; i < this.customer_id; i++)
        {
            System.out.println(this.customer_id + "\t\t"+ this.customer_name+ "\t\t"+ this.customer_mobile);
        }
    }
}