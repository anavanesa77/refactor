package extractvariable.good;

public class Main extends Order {

    void printProductPrice(Order order){

        Double totalPrice = order.getPrice() * order.getQuantity() -
                order.getOfter() + order.getShipping()*2;

        System.out.println(totalPrice);
    }
}
