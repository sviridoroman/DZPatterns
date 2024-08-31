package patterns.factoryMethod;

public class Laptop extends Device{

    @Override
    public void display() {
        System.out.println("Laptop: is turned on - " + isTurnedOn());
    }
    
}
