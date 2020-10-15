package lesson5_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Ball> buffer = new ArrayList<>();
        Supplier supplier = new Supplier(buffer);
        Customer customer = new Customer(buffer);
        supplier.start();
        customer.start();
        Thread.sleep(3000);
        supplier.interrupt();
        customer.interrupt();
    }

}
