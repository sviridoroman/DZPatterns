package patterns.factoryMethod;

public abstract class Device {

    private boolean isTurnOn = false;

    public abstract void display();

    public void turningOn() {
        this.isTurnOn = true;
    }

    public void turningOff() {
        this.isTurnOn = false;
    }

    public boolean isTurnedOn() {
        return isTurnOn;
    }
    
}
