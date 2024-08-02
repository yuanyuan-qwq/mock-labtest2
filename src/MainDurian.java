import java.util.ArrayList;
import durian.Customer;
import durian.CustomerFruitController;
import durian.Fruit;
import durian.InsufficientAmount;
import durian.Staff;
public class MainDurian {
    public static void main(String[] args) {

        CustomerFruitController fruitController = new CustomerFruitController();

        Customer abu = new Customer();
        abu.setTransactionId("T001");

        Staff aminah = new Staff();
        aminah.setId("aminah01");
        aminah.setName("Aminah");
        aminah.setPosition("Sales");

        Fruit durian1 = new Fruit();
        durian1.setName("D24");
        durian1.setCategory("Durian");
        durian1.setWeight(5.0);
        durian1.setPrice(15);
        durian1.setPromotion(true);
        durian1.setStaff(aminah);

        Fruit durian2 = new Fruit();
        durian2.setName("Musang King");
        durian2.setCategory("Durian");
        durian2.setWeight(3.0);
        durian2.setPrice(25);
        durian2.setPromotion(true);
        durian2.setStaff(aminah);

        Fruit durian3 = new Fruit();
        durian3.setName("101");
        durian3.setCategory("Durian");
        durian3.setWeight(20);
        durian3.setPrice(20);
        durian3.setPromotion(true);
        durian2.setStaff(aminah);

        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(durian1);
        fruits.add(durian2);
        fruits.add(durian3);
        abu.setFruits(fruits);

        fruitController.setCustomer(abu);
        System.out.println("Total Price is "+fruitController.getTotalPrice());
        double balance = 0;

        try {
            balance = fruitController.doPayment(400);
        } catch (InsufficientAmount e) {
            e.printInsufficientAmount();
        }
        try {
            balance = fruitController.doPayment(600);
            System.out.println("Balance is :"+balance);
            System.out.println("Sold by "+durian1.getStaff().getName());
        } catch (InsufficientAmount e) {
            e.printStackTrace();
        }
    }
}
