package srp;

class Order {
    String id;
    public Order(String id)
    { this.id = id; }
}

class OrderProcessor {
    public void processOrder(Order order) {
        System.out.println("Обработка заказа " + order.id);
    }
}

class NotificationService {
    public void sendNotification(Order order) {
        System.out.println("Отправка уведомления о заказе " + order.id);
    }
}

public class SrpDemo {
    public static void run() {
        System.out.println("Демонстрация SRP ");
        Order order = new Order("ORD-123");

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);

        NotificationService notifier = new NotificationService();
        notifier.sendNotification(order);
    }
}
