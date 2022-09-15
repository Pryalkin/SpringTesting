package penetration;

public class Tesla implements Car{
    private String model;
    private int age;
    private Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setAge(int age) {
        this.age = age;
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
}
