package patterns.observer;

public class Phone implements Observer{
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
