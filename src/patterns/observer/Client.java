package patterns.observer;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phone = new Phone();
        Observer laptop = new Laptop();

        weatherStation.addObserver(phone);
        weatherStation.addObserver(laptop);

        weatherStation.setWeather("Sunny");
    }
}
