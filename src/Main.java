import static java.lang.System.out;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean trueandfalse = true;

        while (trueandfalse) {
            out.println("\n1. Завдання 1");
            out.println("2. Завдання 2");
            out.println("3. Завдання 3");
            out.println("4. Завдання 4");
            out.println("0. Вихід\n");
            int choice =  scanner.nextInt();

            if (choice == 0) {
                out.println("Вихід з програми.");
                scanner.close();
                trueandfalse = false;
            }

            switch (choice) {
                case 1:
                    out.println("Тестування класу Person:");
                    Person person = new Person();
                    person.inputData();
                    person.displayData();
                    break;
                case 2:
                    out.println("\nТестування класу City:");
                    City city = new City();
                    city.inputData();
                    city.displayData();
                    break;
                case 3:
                    out.println("\nТестування класу Country:");
                    Country country = new Country();
                    country.inputData();
                    country.displayData();
                    break;
                case 4:
                    out.println("\nТестування класу Fraction:");
                    Fraction fraction1 = new Fraction();
                    Fraction fraction2 = new Fraction();

                    out.println("Введіть дані для першого дробу:");
                    fraction1.inputData();
                    out.println("Введіть дані для другого дробу:");
                    fraction2.inputData();

                    Fraction sum = fraction1.add(fraction2);
                    Fraction difference = fraction1.subtract(fraction2);
                    Fraction product = fraction1.multiply(fraction2);
                    Fraction quotient = fraction1.divide(fraction2);

                    out.println("Результати операцій:");
                    out.print("Сума: ");
                    sum.displayData();
                    out.print("Різниця: ");
                    difference.displayData();
                    out.print("Добуток: ");
                    product.displayData();
                    out.print("Частка: ");
                    quotient.displayData();
                    break;
            }
        }
    }
}
