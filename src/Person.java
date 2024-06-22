import static java.lang.System.out;

import java.util.Scanner;

public class Person {
    private String fullName;
    private String birthDate;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {}

    public Person(String fullName, String birthDate, String phoneNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        out.println("Введіть ПІБ: ");
        this.fullName = scanner.nextLine();
        out.println("Введіть дату народження (наприклад, 01-01-1990): ");
        this.birthDate = scanner.nextLine();
        out.println("Введіть контактний телефон: ");
        this.phoneNumber = scanner.nextLine();
        out.println("Введіть місто: ");
        this.city = scanner.nextLine();
        out.println("Введіть країну: ");
        this.country = scanner.nextLine();
        out.println("Введіть домашню адресу: ");
        this.homeAddress = scanner.nextLine();
    }

    public void displayData() {
        out.println("ПІБ: " + this.fullName);
        out.println("Дата народження: " + this.birthDate);
        out.println("Контактний телефон: " + this.phoneNumber);
        out.println("Місто: " + this.city);
        out.println("Країна: " + this.country);
        out.println("Домашня адреса: " + this.homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
