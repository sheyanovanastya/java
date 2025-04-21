//завдання 5
interface MessageSender {
    void send(String to, String message);
}

class EmailSender implements MessageSender {
    public void send(String to, String message) {
        System.out.println("Email на " + to + ": " + message);
    }
}

class TelegramSender implements MessageSender {
    public void send(String to, String message) {
        System.out.println("Telegram на " + to + ": " + message);
    }
}

class OrderService {
    private MessageSender sender;

    public OrderService(MessageSender sender) {
        this.sender = sender;
    }

    public void placeOrder(String user) {
        // логіка замовлення
        sender.send(user, "Ваше замовлення прийнято.");
    }
}

public class DIPExample {
    public static void main(String[] args) {
        OrderService service = new OrderService(new TelegramSender());
        service.placeOrder("Клієнт");
    }
}
