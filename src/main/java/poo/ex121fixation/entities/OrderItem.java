package poo.ex121fixation.entities;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return product.getPrice()*quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return this.price * this.quantity;
    }

}
