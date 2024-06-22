import static java.lang.System.out;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City() {}

    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        out.println("Введіть назву міста: ");
        this.cityName = scanner.nextLine();
        out.println("Введіть назву регіону: ");
        this.regionName = scanner.nextLine();
        out.println("Введіть назву країни: ");
        this.countryName = scanner.nextLine();
        out.println("Введіть кількість жителів у місті: ");
        this.population = Integer.parseInt(scanner.nextLine());
        out.println("Введіть поштовий індекс міста: ");
        this.postalCode = scanner.nextLine();
        out.println("Введіть телефонний код міста: ");
        this.phoneCode = scanner.nextLine();
    }

    public void displayData() {
        out.println("Назва міста: " + this.cityName);
        out.println("Назва регіону: " + this.regionName);
        out.println("Назва країни: " + this.countryName);
        out.println("Кількість жителів у місті: " + this.population);
        out.println("Поштовий індекс міста: " + this.postalCode);
        out.println("Телевонний код міста: " + this.phoneCode);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
