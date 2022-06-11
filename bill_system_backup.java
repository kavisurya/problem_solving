import java.util.Scanner;

public class bill_system_backup {
    public static void main(String[] args) {
    
        bill_system_backup bill_system = new bill_system_backup();
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
    int id = 0;
    int size = 10;
    int customer_id[] = new int[size];
    String customer_name[] = new String[size];
    String customer_mobile[] = new String[size];
    int increment = 0;

    Customer()
    {   

    }

    //Creating a user 
    void Create_user()
    {
        System.out.println("Creating a user !");

        // Getting user input
        Scanner scan = new Scanner(System.in);
        // Getting user's name
        System.out.print("Enter Your name : ");
        customer_name[increment] = scan.nextLine();

        // Getting user's mobile
        System.out.print("Enter Your Mobile : ");
        customer_mobile[increment] = scan.nextLine();

        // And storing the customerID
        customer_id[increment] = id++;
        // Then incrementing the count for next users 
        increment++;
    }


    // Showing all customer lists
    void Customer_list()
    {
        System.out.println("ID\t\tNAME\t\tMOBILE");

        for(int i=0; i < increment; i++)
        {
            System.out.println(customer_id[i] + "\t\t"+ customer_name[i]+ "\t\t"+ customer_mobile[i]);
        }
    }
}