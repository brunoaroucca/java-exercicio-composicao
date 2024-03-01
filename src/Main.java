import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfHours = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter Client Data: \n");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.next());

        System.out.println("Enter order data: \n");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, new Client(name, email, birthDate));

        System.out.print("How many items to this order? ");
        int numberItem = sc.nextInt();

        for(int i = 1; i <= numberItem; i++){
            System.out.println("Enter #" + i + " item data: \n");
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, new Product(productName, price));
            order.addItem(orderItem);
        }



        System.out.println(" ");
        System.out.println("Order moment: "+ sdfHours.format(order.getMoment()));
        System.out.println("Order status: "+ order.getStatus());
        System.out.println("Client: "+ order.getClient().getName() + " - ("
                + sdf.format(order.getClient().getBirthDate()) + ") - "
                + order.getClient().getEmail() );
        System.out.println("Order items: ");

        for(OrderItem item : order.getItems()){
            System.out.print(item.getProduct().getName() + ", "
                    + item.getProduct().getPrice() + ", Quantity: "
                    + item.getQuantity() + ", Subtotal:" + item.subTotal() + "\n");
        }

        System.out.println("Total Price: " + order.total());



    }
}