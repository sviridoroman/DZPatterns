package patterns.decorator;

public class BatteryDecorator extends DeviceDecorator{
    
    public BatteryDecorator(Device decoratedDevice,String info) {
        super(decoratedDevice,info);
    }
    
    @Override
    public String getSpecification() {
        return decoratedDevice.getSpecification() + "Battery: " + info + "\n";
    }
}
