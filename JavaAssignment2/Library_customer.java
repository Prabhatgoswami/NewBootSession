package Java_Assignment2;

public interface Library_customer {
    public void addCustomer(String customerName,String customerAddress,Books books);
    public void Display();
    public int ReturnTime(int date_of_issue,int date_of_return);
}
