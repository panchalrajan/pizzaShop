package Menu;

import IndividualProduct.Pizza;

import java.util.ArrayList;

public class PizzaMenu {
    private ArrayList<Pizza> list;

    public ArrayList<Pizza> getList() {
        return list;
    }

    public void setList(ArrayList<Pizza> list) {
        this.list = list;
    }

    public PizzaMenu() {
        this.list = new ArrayList<>();
        generateData();
        print();
        System.out.println("Please Select a Pizza, & Reply the Product ID : ");
    }

    private void generateData() {
        add(1, "MARGHERITA", "VEG    ", 200);
        add(2, "FARM HOUSE", "VEG    ", 300);
        add(3, "DELUXE VEGGIE", "VEG    ", 300);
        add(4, "EXTRAVAGANZA", "VEG    ", 400);
        add(5, "CHICKEN FIESTA", "NON VEG", 300);
        add(6, "KEEMA DO PYAZA", "NON VEG", 300);
        add(7, "NON VEG SUPREME", "NON VEG", 400);
        add(8, "INDI CHICKEN TIKKA", "NON VEG", 400);
    }


    public void add(int productID, String name, String vegOrNonVeg, int price) {
        Pizza pizza = new Pizza(productID, name, vegOrNonVeg, price);
        list.add(pizza);
    }

    public void print() {
        System.out.println("<--------------------PIZZA MENU START-------------------->");
        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("<---------------------PIZZA MENU END--------------------->");
    }

}
