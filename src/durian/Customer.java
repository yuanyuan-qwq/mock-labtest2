package durian;

import java.util.ArrayList;

public class Customer {
    private String transactionId;
    ArrayList<Fruit> fruits;

    public Customer() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }
}
