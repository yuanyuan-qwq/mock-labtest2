package durian;

public class Fruit{

    private String id;
    private String category;
    private String name;
    private double weight;
    private double price;
    private static boolean promotion;

    private Staff staff;

    public Fruit() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static boolean isPromotion() {
        return promotion;
    }

    public static void setPromotion(boolean promotion) {
        Fruit.promotion = promotion;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
