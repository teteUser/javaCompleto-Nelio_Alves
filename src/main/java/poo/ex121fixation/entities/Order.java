package poo.ex121fixation.entities;

import general.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<>();

    public Order() {
        this.moment = new Date();
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = OrderStatus.valueOf(orderStatus);
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

}
