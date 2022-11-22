package Menu;

import IndividualProduct.Crust;
import IndividualProduct.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CrustMenu {
    private ArrayList<Crust> list;

    public ArrayList<Crust> getList() {
        return list;
    }

    public void setList(ArrayList<Crust> list) {
        this.list = list;
    }

    public CrustMenu() {
        this.list = new ArrayList<>();
        generateData();
        print();
        System.out.println("Please Select Pizza Crust, & Reply the Product ID : ");
    }

    private void generateData() {
        add(1,"NEW HAND TOSSED", 00);
        add(2,"100% WHEAT THIN", 30);
        add(3,"CHEESE BURST   ", 50);
        add(4,"FRESH PAN      ", 75);
    }


    public void add(int productID, String name, int price) {
        Crust crust = new Crust(productID, name, price);
        list.add(crust);

    }

    public void print() {
        System.out.println("<--------------------PIZZA CRUST MENU START-------------------->");
        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("<---------------------PIZZA CRUST MENU END--------------------->");
    }
}