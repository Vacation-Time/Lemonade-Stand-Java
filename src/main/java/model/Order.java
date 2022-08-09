package model;

import java.util.Arrays;

public class Order {

    private Customer customer;
    private Lemonade[] lemonades;
    private double total;

    public Order(Customer customer) {
        super();
        this.customer = customer;
        lemonades = new Lemonade[0];
        total = 0.0;  // default will be 0, but this is to make sure it is for me to see as I learn (⌐■_■)
    }

//    private void updateTotal() {  //extra method and not needed
//        total = 0.0;
//        for (Lemonade l : lemonades) {
//            total += l.getPrice();
//        }
//    }

    // below is one way to use 'for' loop to create each lemonade for a cx
//    public void addLemonade(Lemonade lemonade) {
//        Lemonade[] temp = new Lemonade[lemonades.length + 1];
//        for (int i = 0; i < lemonades.length; i++) {
//            temp[i] = lemonades[i];
//        }
//        temp[temp.length - 1] = lemonade;
//        lemonades = temp;
//    }

    //below is a way to do above but using 'Arrays.copyOf' on 1 line
    public void addLemonade(Lemonade lemonade) {
        Lemonade[] newLemonadeArray = Arrays.copyOf(lemonades, lemonades.length + 1);
        newLemonadeArray[newLemonadeArray.length - 1] = lemonade;
        lemonades = newLemonadeArray;
        total += lemonade.getPrice();  //removed 'updateTotal' from above method and r2 with ←
    }

    public Customer getCustomer() {
        return customer;
    }

    public Lemonade[] getLemonades() {
        return lemonades;
    }

    public double getTotal() {
        return total;
    }
}
