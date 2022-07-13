public class CreditPaymentService {
    public double calculate(double percent , int amount , int month) {
        double percentMonth = percent / 12 / 100;
        double a = 1 + percentMonth;
        double b = month;
        Math.pow(a , b);
        double ratio = (percentMonth * (Math.pow(a , b ))) / (Math.pow(a , b) - 1);
        double payment = amount * ratio;

        return payment;
    }

}
