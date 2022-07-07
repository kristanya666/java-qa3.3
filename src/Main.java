public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int sum = 1_000_000; //сумма кредита
        double i = 9.99; //годовая ставка
        int term1 = 1; //срок в годах
        int A = service.calculate(sum, i, term1);

        System.out.println("Сумма: 1 000 000 руб Ставка: 9,99% Срок: 1 год");
        System.out.print(A);
        System.out.println(" руб. ежемесячный платёж");
        System.out.println();


        int term2 = 2; //срок в годах
        int A2 = service.calculate(sum, i, term2);

        System.out.println("Сумма: 1 000 000 руб Ставка: 9,99% Срок: 2 года");
        System.out.print(A2);
        System.out.println(" руб. ежемесячный платёж");
        System.out.println();


        int term3 = 3; //срок в годах
        int A3 = service.calculate(sum, i, term3);

        System.out.println("Сумма: 1 000 000 руб Ставка: 9,99% Срок: 3 года");
        System.out.print(A3);
        System.out.println(" руб. ежемесячный платёж");

    }
}
