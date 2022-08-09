package LemonadeStand;

import model.Customer;
import model.Lemonade;
import model.Order;

public class Application {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Will", "999-999-9999");
        Customer customer2 = new Customer("Frank", "991-991-9199");

        Order order1 = new Order(customer1);

        System.out.println(order1.getCustomer().getName());

        order1.addLemonade(new Lemonade(1, 1, 1, 5));
        order1.addLemonade(new Lemonade(1.5, 1, 1, 7));
        order1.addLemonade(new Lemonade(2, 1, 2, 9));
        order1.addLemonade(new Lemonade(2, 1.5, 1.5, 10));
        order1.addLemonade(new Lemonade(2.5, 1.5, 2.5, 12));

        for (Lemonade l : order1.getLemonades()) {
            System.out.println("Per Cup: $" + l.getPrice());
        }

        System.out.println("Order 1 total: $" + order1.getTotal() + "\n");


        Order order2 = new Order(customer2);

        System.out.println(order2.getCustomer().getName());

        order2.addLemonade(new Lemonade(1, 1.5, 1, 5));
        order2.addLemonade(new Lemonade(1.5, 1, 1, 7));
        order2.addLemonade(new Lemonade(1, 1, 2, 9));
        order2.addLemonade(new Lemonade(2.5, 1.5, 1.5, 10));
        order2.addLemonade(new Lemonade(1, 1.5, 2.5, 12));

        for (Lemonade l : order2.getLemonades()) {
            System.out.println("Per Cup: $" + l.getPrice());
        }

        System.out.println("Order 2 total: $" + order2.getTotal() + "\n");


    }
}
