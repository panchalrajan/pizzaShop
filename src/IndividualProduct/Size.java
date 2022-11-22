package IndividualProduct;

public class Size {
    private int productID;
    private String name;
    private int price;

    public Size(int productID, String name, int price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String details = "Product ID -> " + getProductID() +
                " | Size -> " + getName() +
                " | Price to be Added -> " + getPrice();
        return details;
    }
}
