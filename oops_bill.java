import java.util.*;

public class test {

    public static void main(String[] args) {
       
        Customer customer[] = new Customer[100];
        Items items[] = new Items[100];
        Bill bill[] = new Bill[100];

        int increment = 0;
        int items_increment = 0;
        int bill_increment = 0;
        test bill_system = new test();


        while(true)
        {
            int user_input = bill_system.show_lable();

        switch(user_input)
        {
            case 1:
            {
                System.out.println("Creating a user !");

                // Getting user input
                Scanner scan = new Scanner(System.in);
                // Getting user's name
                System.out.print("Enter Your name : ");
                String name = scan.nextLine();

                // Getting user's mobile
                System.out.print("Enter Your Mobile : ");
                String mobile = scan.nextLine();

                // And storing the customerID
                // Then incrementing the count for next users 
                customer[increment] = new Customer(increment, name, mobile);
                increment++;

                break;
            }
            case 2:
            {
                System.out.println("Creating a Items !");

                // Getting user input
                Scanner scan = new Scanner(System.in);
                // Getting user's name
                System.out.print("Enter Your Item Name : ");
                String name = scan.nextLine();

                System.out.print("Enter a Price for : "+ name+" :");
                int price = scan.nextInt();


                System.out.print("Enter a quantity for : "+ name+" :");
                int quantity = scan.nextInt();

                // And storing the customerID
                // Then incrementing the count for next users 
                items[items_increment] = new Items(items_increment, price,quantity,name);
                items_increment++;
                break;
            }
            case 3:
            {
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t-----------------------------------------------------");
                System.out.println("\t\t\t\t\t-: Availability of products in store ! :-");
                System.out.println("\t\t-----------------------------------------------------");
        

                System.out.println("ID\t\tNAME\t\tQUANTITY\t\tPRICE");

                for(int i=0; i < items_increment; i++)
                {
                    System.out.println(items[i].items_id + "\t\t"+ items[i].items_name+ "\t\t"+ items[i].items_quantity+"\t\t"+ items[i].items_price);
                }


                int n;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter How many products do you want? :");
                n = scan.nextInt();
                
                System.out.println("Enter the customer ID :");
                int customer_id = scan.nextInt();

                int check_availability_product = 0;
                int check_availability_qty = 0;
                int item=0;
                String products;
                System.out.println("Enter your products");
                products = scan.nextLine();
                for(int i=0; i < n; i++)
                {
                    
                    System.out.println("Enter your quantity of products");
                    int quantity = scan.nextInt();



                    for(item=0; item < items_increment; item++)
                    {
                        if(products.equals(items[item].items_name))
                        {
                            break;
                        }
                        else
                        {
                            check_availability_product = 1;
                        }
                    }


                    if(check_availability_product != 0)
                    {
                        System.out.println("Sorry "+products+ " This product not found in our store !");
                    }
                    else
                    {
                        if(items[item].items_quantity <= quantity)
                        {
                            check_availability_qty = 0;
                        }
                        else
                        {
                            System.out.println("Sorry "+products+ "This product not have entered quantity !");
                            check_availability_qty = 1;
                        }
                    }


                    if(check_availability_qty == 0)
                    {
                        int price = items[item].items_price;
                        int total = price * quantity;
                        items[item].items_quantity = items[item].items_quantity - quantity;
                        // End of it
                        bill[bill_increment] = new Bill(customer_id, bill_increment++, price, quantity,products, total );
                        System.out.println("Sucessfully purchased");
                    }
    
                    
                }
              
                break;
            }
            case 4:
            {
                // System.out.println("Increment vals : " + customer.increment);
                // customer.Customer_list();
                System.out.println("ID\t\tNAME\t\tMOBILE");

                for(int i=0; i < increment; i++)
                {
                    System.out.println(customer[i].customer_id + "\t\t"+ customer[i].customer_name+ "\t\t"+ customer[i].customer_mobile);
                }
                break;
            }
            case 5:
            {
                System.out.println("ID\t\tNAME\t\tQUANTITY\t\tPRICE");

                for(int i=0; i < items_increment; i++)
                {
                    System.out.println(items[i].items_id + "\t\t"+ items[i].items_name+ "\t\t"+ items[i].items_quantity+"\t\t"+ items[i].items_price);
                }
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

class Customer
{
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
}

class Items
{
    int items_id;
    int items_price;
    int items_quantity;
    String items_name;

    Items(int id,int price, int quantity, String name)
    {   
        this.items_id = id;
        this.items_price = price;
        this.items_quantity = quantity;
        this.items_name = name;
    }

    Items(){}
}



class Bill
{
    int customer_id;
    int bill_id;
    String products;
    int bill_per_price;
    int bill_per_quantity;
    int total;

    Bill(int customer_id,int bill_id, int bill_per_price, int bill_per_quantity, String products, int total)
    {   
        this.customer_id = customer_id;
        this.bill_id = bill_id;
        this.bill_per_price = bill_per_price;
        this.bill_per_quantity = bill_per_quantity;
        this.total = total;
        this.products = products;
    }

    Bill(){}
}
