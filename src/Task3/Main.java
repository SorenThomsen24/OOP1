package Task3;

import java.util.ArrayList;

public class Main
{
    static ArrayList<Customer> customers = new ArrayList<>();


    public static void main(String[] args) {

        customers.add(new Customer("Søren", "Thomsen", "ST12345"));
        customers.add(new Customer("Bastian", "Holm", "BH12345"));
        customers.add(new Customer("Marc", "Zuckerberg", "MZ12345"));
        customers.add(new Customer("Erling", "Haaland", "EH12345"));
        customers.add(new Customer("Carlos", "Sainz", "CS12345"));
        customers.add(new Customer("Michael", "Phelps", "MP12345"));

        printCustomers();
    }
      private static void printCustomers()
        {
            for (Customer c: customers)
            {
                System.out.println(c);
            }
        }

}

