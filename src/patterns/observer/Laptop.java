package patterns.observer;

public class Laptop implements Observer{
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("Laptop Display: Weather updated - " + weather);
    }
}
