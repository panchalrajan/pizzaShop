package IndividualProduct;

public class Pizza {
    private int productID;
    private String name;
    private String vegOrNonVeg;
    private int price;

    public Pizza(int productID, String name, String vegOrNonVeg, int price) {
        this.productID = productID;
        this.name = name;
        this.vegOrNonVeg = vegOrNonVeg;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getVegOrNonVeg() {
        return vegOrNonVeg;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String details = "Product ID -> " + getProductID() +
                " | Category -> " + getVegOrNonVeg() +
                " | Price -> " + getPrice() +
                " | Name -> " + getName();
        return details;
    }
}
