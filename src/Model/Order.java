package Model;

import IndividualProduct.*;
import Menu.*;
import java.util.*;

public class Order {
    public Order() throws InterruptedException {
        Cart cart = new Cart();
        selectPizza(cart);
        selectSize(cart);
        selectCrust(cart);
        selectToppings(cart);
    }


    private void selectPizza(Cart cart) throws InterruptedException {
        PizzaMenu pizzaMenu = new PizzaMenu();
        ArrayList<Pizza> arr = pizzaMenu.getList();

        Scanner sc = new Scanner(System.in);
        int pizzaSelected = sc.nextInt();
        if(pizzaSelected > arr.size() || pizzaSelected == 0) {
            System.out.println("Please Give Correct Input");
            selectPizza(cart);
        }
        else cart.add(arr.get(pizzaSelected-1));
    }

    private void selectSize(Cart cart) throws InterruptedException {
        SizeMenu sizeMenu = new SizeMenu();
        ArrayList<Size> arr = sizeMenu.getList();

        Scanner sc = new Scanner(System.in);
        int sizeSelected = sc.nextInt();

        if(sizeSelected > arr.size() || sizeSelected == 0) {
            System.out.println("Please Give Correct Input");
            selectSize(cart);
        }
        else cart.add(arr.get(sizeSelected-1));
    }

    private void selectCrust(Cart cart) throws InterruptedException {
        CrustMenu crustMenu = new CrustMenu();
        ArrayList<Crust> arr = crustMenu.getList();

        Scanner sc = new Scanner(System.in);
        int crustSelected = sc.nextInt();

        if(crustSelected > arr.size() || crustSelected == 0) {
            System.out.println("Please Give Correct Input");
            selectCrust(cart);
        }
        else cart.add(arr.get(crustSelected-1));
    }

    private void selectToppings(Cart cart) throws InterruptedException {
        ToppingsMenu toppingsMenu = new ToppingsMenu();
        ArrayList<Toppings> arr = toppingsMenu.getList();
        HashSet<Integer> added = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            int toppingSelected = sc.nextInt();
            if(toppingSelected == 0)  {
                cart.print();
                break;
            }
            else if(toppingSelected > arr.size()) {
                System.out.println("Please Give Correct Input");
                selectToppings(cart);
            }
            else {
                if(added.contains(toppingSelected-1)) {
                    System.out.println("Topping already added in your cart");
                } else {
                    added.add(toppingSelected-1);
                    cart.add(arr.get(toppingSelected-1));
                }
            }
        }
    }


}
