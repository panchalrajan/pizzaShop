package Menu;

import IndividualProduct.Size;

import java.util.ArrayList;

public class SizeMenu {
    private ArrayList<Size> list;
    private static int increment = 1;

    public ArrayList<Size> getList() {
        return list;
    }

    public void setList(ArrayList<Size> list) {
        this.list = list;
    }

    public SizeMenu() {
        this.list = new ArrayList<Size>();
        generateData();
        print();
        System.out.println("Please Select Pizza Size, & Reply the Product ID : ");
    }

    private void generateData() {
        add(1, "SMALL ", 00);
        add(2, "MEDIUM", 30);
        add(3, "LARGE ", 50);
    }

    public void add(int productID, String name, int price) {
        Size size = new Size(productID, name, price);
        list.add(size);
    }

    public void print() {
        System.out.println("<--------------------PIZZA SIZE MENU START-------------------->");
        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("<---------------------PIZZA SIZE MENU END--------------------->");
    }
}
