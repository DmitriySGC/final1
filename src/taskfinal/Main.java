package taskfinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double currencyRate = in.nextDouble();
        System.out.println("Количество рублей: ");
        double amount = in.nextDouble();
        System.out.println("Итого: " + amount/currencyRate);


    }

}
