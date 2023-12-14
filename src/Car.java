public class Car extends Vehicle implements Comparable<Car>{
    private String brand;
    private String model;
    private int year;

    public Car() {
        brand = "";
        model = "";
        year = 0;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println("The car is moving");
    }

    @Override
    public int compareTo(Car o) {
        return this.year-o.year;
    }

    public String toString(int i) {
        return "Car "+ i + ":" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year;
    }
}
