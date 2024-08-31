package patterns.factoryMethod;

public class PhoneFactory extends DeviceFactory {

    @Override
    public Device factoryMethod() {
        return new Phone();
    }
    
}
