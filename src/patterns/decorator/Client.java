package patterns.decorator;

public class Client {
    public static void main(String[] args) {
        Device phone = new DeviceImpl("Phone");
        phone = new CameraDecorator(phone, "50 MP");
        phone = new BatteryDecorator(phone,"4000 mAh");
        System.out.println(phone.getSpecification());
        
    }
}
