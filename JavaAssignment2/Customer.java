package Java_Assignment2;
class Cafe {
    public int TokenNumber;
    public String order;
    private float payment;

    public int getTokenNumber()
    {
        return this.TokenNumber;
    }
    public void waitforCoffee(){}
    public void collectcoffee(){}
    public void paypayment(){}
    public void placeorder(){}
}

class Cashier{
    private String Order;
    private String getOrder()
    {
        return this.Order;
    }
    public void receivePayment(){}
    public void notify(Cafe customer){}

}
public class Customer{
    public static void main(String[] args) {

    }
}

