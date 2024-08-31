package patterns.decorator;

public abstract class DeviceDecorator implements Device{
    protected Device decoratedDevice;
    protected String info;
    
    public DeviceDecorator(Device decoratedDevice, String info) {
        this.decoratedDevice = decoratedDevice;
        this.info = info;
    }

    @Override
    public String getSpecification() {
        return decoratedDevice.getSpecification();
    }
}
