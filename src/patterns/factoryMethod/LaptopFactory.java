package patterns.factoryMethod;

public class LaptopFactory extends DeviceFactory{

    @Override
    public Device factoryMethod() {
        return new Laptop();
    }
    
}
