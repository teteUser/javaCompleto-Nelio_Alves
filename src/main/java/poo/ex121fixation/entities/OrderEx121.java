package poo.ex121fixation.entities;

import poo.ex121fixation.entities.enums.OrderStatusEx121;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderEx121 {
    private Date moment;
    private OrderStatusEx121 orderStatus;
    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<>();

    public OrderEx121() {
        this.moment = new Date();
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatusEx121 getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEx121 orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addItem(OrderItem orderItem){
        this.orderItemList.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        this.orderItemList.remove(orderItem);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem orders : orderItemList){
            sum += orders.subTotal();
        }
        return sum;
    }

    public String toSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: " + this.moment + "\n");
        sb.append("Order status: " + this.orderStatus.toString() + "\n");
        sb.append("Client: " + this.client.getName() + " " + this.client.getBirthDate() + " " + this.client.getEmail() + "\n");
        sb.append("Order items:\n");
        for(OrderItem o : orderItemList){
            sb.append(o.getProduct().getName() + ", $" + Double.toString(o.getProduct().getPrice()) + ", Quantity: " + Integer.toString(o.getQuantity()) + ", Subtotal: $" + Double.toString(o.getPrice()) + "\n");
        }
        sb.append("Total price: " + Double.toString(this.total()) + "\n");

        return sb.toString();
    }
}
