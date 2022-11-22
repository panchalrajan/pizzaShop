package Model;

import IndividualProduct.Crust;
import IndividualProduct.Pizza;
import IndividualProduct.Size;
import IndividualProduct.Toppings;
import Menu.SizeMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cart {
    private int totalPrice;
    private ArrayList<String> orderDetails;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Cart() {
        this.totalPrice = 0;
        this.orderDetails = new ArrayList<>();
    }

    public void add(Pizza pizza) throws InterruptedException {
        orderDetails.add("-->  Pizza -> "+ pizza.getName() + " | Price -> " + pizza.getPrice());
        setTotalPrice(getTotalPrice() + pizza.getPrice());
        System.out.println(pizza.getName() + " PIZZA ADDED TO CART | CART TOTAL = " + getTotalPrice());

        TimeUnit.SECONDS.sleep(1);
    }
    public void add(Size size) throws InterruptedException {
        orderDetails.add("-->  Size -> "+ size.getName() + " | Price -> " + size.getPrice());
        setTotalPrice(getTotalPrice() + size.getPrice());
        System.out.println("PIZZA SIZE UPDATED TO " + size.getName() + " | CART TOTAL = " + getTotalPrice());

        TimeUnit.SECONDS.sleep(1);
    }

    public void add(Crust crust) throws InterruptedException {
        orderDetails.add("-->  Crust -> "+ crust.getName() + " | Price -> " + crust.getPrice());
        setTotalPrice(getTotalPrice() + crust.getPrice());
        System.out.println("PIZZA CRUST UPDATED TO " + crust.getName() + " | CART TOTAL = " + getTotalPrice());

        TimeUnit.SECONDS.sleep(1);
    }

    public void add(Toppings topping) throws InterruptedException {
        orderDetails.add("-->  Topping -> "+ topping.getName() + " | Price -> " + topping.getPrice());
        setTotalPrice(getTotalPrice() + topping.getPrice());
        System.out.println(topping.getName() + " TOPPING ADDED TO CART | CART TOTAL = " + getTotalPrice());

        TimeUnit.SECONDS.sleep(1);
    }

    public void print() throws InterruptedException {
        System.out.println("<---------------------CART STARTS--------------------->");
        for(int i=0;i<orderDetails.size();i++) {
            System.out.println(orderDetails.get(i));
        }
        System.out.println("Cart Total : " + getTotalPrice());
        System.out.println("<----------------------CART ENDS---------------------->");
        checkout();
    }

    private void checkout() throws InterruptedException {
        System.out.println("Press 1 to Confirm Order , Press 2 to Empty the Cart");
        Scanner sc = new Scanner(System.in);
        int decision = sc.nextInt();
        if(decision == 1) {
            int orderID = (int) (Math.random()*500);
            System.out.println("Order Placed Successfully , Your Order ID is " + orderID);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Thank You for Placing Order at Worst Pizza Shop");
        } else if(decision == 2) {
            System.out.println("Cart Deleted, Please make a New Pizza Order");
            TimeUnit.SECONDS.sleep(1);
            Order order = new Order();
        } else {
            System.out.println("Please give Correct Input");
            checkout();
        }
    }

}
