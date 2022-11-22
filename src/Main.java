import Menu.PizzaMenu;
import Model.Order;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Worst Pizza Shop");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Please make an Order using Online Menu");
        TimeUnit.SECONDS.sleep(1);
        Order order = new Order();
    }
}
