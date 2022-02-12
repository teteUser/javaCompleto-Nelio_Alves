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

}
