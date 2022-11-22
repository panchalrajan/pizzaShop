package Menu;


import IndividualProduct.Toppings;

import java.util.ArrayList;

public class ToppingsMenu {
    private ArrayList<Toppings> list;

    public ArrayList<Toppings> getList() {
        return list;
    }

    public void setList(ArrayList<Toppings> list) {
        this.list = list;
    }

    public ToppingsMenu() {
        this.list = new ArrayList<>();
        generateData();
        print();
        System.out.println("Please Reply 0 to Continue, or continue adding Toppings : ");
    }

    private void generateData() {
        add(1, "EXTRA CHEESE", "VEG    ", 50);
        add(2, "ONION", "VEG    ", 50);
        add(3, "BLACK OLIVE", "VEG    ", 50);
        add(4, "TOMATO", "VEG    ", 50);
        add(5, "PEPPERONI", "NON VEG", 50);
        add(6, "CHICKEN BREAST", "NON VEG", 75);
    }


    public void add(int productID, String name, String vegOrNonVeg, int price) {
        Toppings toppings = new Toppings(productID, name, vegOrNonVeg, price);
        list.add(toppings);
    }

    public void print() {
        System.out.println("<-------------------TOPPINGS MENU START------------------->");
        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("<--------------------TOPPINGS MENU END-------------------->");
    }
}
