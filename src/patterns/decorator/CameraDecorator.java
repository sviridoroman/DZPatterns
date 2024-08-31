package patterns.decorator;

public class CameraDecorator extends DeviceDecorator{

    public CameraDecorator(Device decoratedDevice, String info) {
        super(decoratedDevice, info);
    }
    
    @Override
    public String getSpecification() {
        return decoratedDevice.getSpecification() + "Camera: " + info + "\n";
    }
}
