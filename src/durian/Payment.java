package durian;

public interface Payment {
    public double doPayment(double payment)throws  InsufficientAmount;
}
