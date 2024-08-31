package patterns.factoryMethod;

public class Phone extends Device{

    @Override
    public void display() {
        System.out.println("Phone: is turned on - " + isTurnedOn());
    }
    
}
