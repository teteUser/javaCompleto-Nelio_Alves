package poo.ex121fixation.model.entities;

import poo.ex121fixation.enums.OrderStatusEx121;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderEx121 {
    private Date moment;
    private OrderStatusEx121 orderStatus;
    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + this.orderStatus + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items:\n");
        for(OrderItem o : orderItemList){
            sb.append(o.getProduct().getName() + ", $" + String.format("%.2f", o.getProduct().getPrice()) + ", Quantity: " + Integer.toString(o.getQuantity()) + ", Subtotal: $" + String.format("%.2f", o.getPrice()) + "\n");
        }
        sb.append("Total price: " + String.format("%.2f", this.total()) + "\n");

        return sb.toString();
    }
}
