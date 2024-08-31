package patterns.factoryMethod;

public class Client {
    public static void main(String[] args) {
        DeviceFactory laptopFactory = new LaptopFactory();
        DeviceFactory phoneFactory = new PhoneFactory();

        Device phone = phoneFactory.factoryMethod();
        phone.turningOn();
        phone.display();

        Device laptop = laptopFactory.factoryMethod();
        laptop.display();
    }
}
