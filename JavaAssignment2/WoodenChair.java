package Java_Assignment2;

public class WoodenChair extends Chair {
    @Override
    public String ChairType() {
        String string=" Wooden Chair";
        return string;
    }

    @Override
    public void StressTest() {
        System.out.println("Stress Test for WoodenChair is Approved");

    }

    @Override
    public void FireTest() {
        System.out.println("Fire Test for WoodenChair is Approved..");

    }
}
