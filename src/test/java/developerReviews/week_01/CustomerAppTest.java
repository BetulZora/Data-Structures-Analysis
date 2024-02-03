package developerReviews.week_01;

public class CustomerAppTest {
    public static void main(String[] args) {
        CustomerLL customers = new CustomerLL();
        customers.insertLast(new CNode("Jack", "Ryan"));
        customers.insertLast(new CNode("Harry", "Potter"));
        customers.insertLast(new CNode("Frodo", "Baggins"));
        customers.insertLast(new CNode("Shae", "Ohmsford"));
        customers.insertLast(new CNode("Lucifer", "Morningstar"));

         //customers.printNames();

         customers.deleteByName("Jack");
        System.out.println("________________________\n DELETED JACK");
        customers.printNames();
        System.out.println("________________________\n DELETED LUCIFER");
        customers.deleteByName("Lucifer");
        customers.printNames();
        System.out.println("________________________\n DELETED FRODO");
        customers.deleteByName("Frodo");
        customers.printNames();
    }
}
