public class CreditPaymentService {
    public int calculate(int sum, double i, int term) {
        int n = term * 12;
        double rate = ((i / 12) / 100);
        double ratePlusOne = 1 + rate;
        double degree = Math.pow(ratePlusOne, n);
        double K = (rate * degree) / (degree - 1);
        double payment = K * sum;
        int convertedPayment = (int) payment;
        return (convertedPayment);
    }
}
