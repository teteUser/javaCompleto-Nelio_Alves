package general.enums;

public class EnumExample {

    public static void main(String[] args) {

        Order order = new Order();

        System.out.println(order);

        order.setStatus(OrderStatus.PROCESSING);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }

}
