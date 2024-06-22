import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Тестування класу Person:");
        Person person = new Person();
        person.inputData();
        person.displayData();

        out.println("\nТестування класу City:");
        City city = new City();
        city.inputData();
        city.displayData();

        out.println("\nТестування класу Country:");
        Country country = new Country();
        country.inputData();
        country.displayData();

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
    }
}
