import static java.lang.System.out;

import java.util.Scanner;

public class Country {
    private String countryName;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private String[] cities;

    public Country() {}

    public Country(String countryName, String continent, int population, String phoneCode, String capital, String[] cities) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        out.println("Введіть назву країни: ");
        this.countryName = scanner.nextLine();
        out.println("Введіть назву континенту: ");
        this.continent = scanner.nextLine();
        out.println("Введіть кількість жителів у країні: ");
        this.population = Integer.parseInt(scanner.nextLine());
        out.println("Введіть телефонний код країни: ");
        this.phoneCode = scanner.nextLine();
        out.println("Введіть назву столиці: ");
        this.capital = scanner.nextLine();
        out.println("Введіть кількість міст у країні: ");
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        this.cities = new String[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            out.println("Введіть назву міста " + (i + 1) + ": ");
            this.cities[i] = scanner.nextLine();
        }
    }

    public void displayData() {
        out.println("Назва країни: " + this.countryName);
        out.println("Назва континенту: " + this.continent);
        out.println("Кількість жителів у країні: " + this.population);
        out.println("Телефонний код країни: " + this.phoneCode);
        out.println("Назва столиці: " + this.capital);
        out.print("Назви міст країни: ");
        for (String city : this.cities) {
            out.print(city + ", ");
        }
        out.println();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
