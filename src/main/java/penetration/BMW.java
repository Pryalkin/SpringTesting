package penetration;

public class BMW implements Car{
    private String model;
    private int age;
    private Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getDeviceModel() {
        return device.getModelDevice();
    }

    public Device getDevice() {
        return device;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
