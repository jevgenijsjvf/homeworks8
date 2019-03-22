package HW5;
import java.util.Objects;

class SmartPhone {
    private String manufacturer;
    private String color;
    private String processorType;
    private double screenSize;


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(that.screenSize, screenSize) &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(color, that.color) &&
                Objects.equals(processorType, that.processorType);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", processorType='" + processorType + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
