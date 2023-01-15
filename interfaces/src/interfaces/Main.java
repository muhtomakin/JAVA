package interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {
                new SmsLogger(),
                new DatabaseLogger(),
                new FileLogger(),
        };
        Customer customer1 = new Customer(1, "Muh", "Toma");
        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.add(customer1);
    }
}