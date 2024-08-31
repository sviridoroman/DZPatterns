package patterns.decorator;

public class DeviceImpl implements Device{
    private String name;
    private String specifications;
    
    public DeviceImpl(String name) {
        this.name = name;
        specifications = name + " specifications:\n";
    }


    @Override
    public String getSpecification() {
        return specifications;
    }
       
}
