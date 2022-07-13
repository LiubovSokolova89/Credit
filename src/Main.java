public class Main {
    public static void main(String[] args) {
      CreditPaymentService service = new CreditPaymentService();
      double percent = 9.99;
      int month = 12;
      int amount = 1_000_000;
      double pay = service.calculate(percent , amount ,month);

      System.out.println("Сумма кредита: " + amount);
      System.out.println("Процентная ставка: " + percent + "%");
      System.out.println("Ежемесячный платёж: " + Math.round(pay));

    }
}
