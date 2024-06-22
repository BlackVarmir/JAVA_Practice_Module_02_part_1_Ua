import static java.lang.System.out;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {}

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменник не може бути нулем.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        out.println("Введіть чисельник: ");
        this.numerator = Integer.parseInt(scanner.nextLine());
        out.println("Введіть знаменник: ");
        this.denominator = Integer.parseInt(scanner.nextLine());
        if (this.denominator == 0) {
            throw new IllegalArgumentException("Знаменник не може бути нулем.");
        }
    }

    public void displayData() {
        out.println("Дріб: " + this.numerator + "/" + this.denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменник не може бути нулем.");
        }
        this.denominator = denominator;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Ділення на нуль не дозволено.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        Fraction result = new Fraction(newNumerator, newDenominator);
        result.reduce();
        return result;
    }
}
