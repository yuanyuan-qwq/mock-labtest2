package durian;

import java.util.ArrayList;

public class CustomerFruitController implements Payment {

    private Customer customer;

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public double getTotalPrice(){
        double promo,dis,total=0,price = 0;

        ArrayList<Fruit> fruits = getCustomer().getFruits();
        for(Fruit fruit : fruits) {
            price = fruit.getPrice()*fruit.getWeight();


            if (fruit.isPromotion()) {
                promo = price * 0.10;
            } else {
                promo = price * 0;
            }


            if (fruit.getWeight() >= 20 && fruit.getWeight() < 50) {
                dis = price * 0.10;
            } else if (fruit.getWeight() >= 50) {
                dis = price * 0.30;
            } else {
                dis = price * 0;
            }
            total=total+(price-promo-dis);
        }

        return total;
    }

    public double doPayment(double price) throws InsufficientAmount{
        if(price-getTotalPrice()<0){
            throw new InsufficientAmount();
        }

        return price-getTotalPrice();
    }


}
