package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.PopUpNotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new PopUpNotificationService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
        }
    }

