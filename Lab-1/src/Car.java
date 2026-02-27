public class Car {
    private final int power;
    private final double engineVolume;
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final String fuelType;

    public Car(int power, double engineVolume, String brand, String model, int year, String color, String fuelType) {
        this.power = power;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelType = fuelType;
    }

    public int getPower() { return power; }
    public double getEngineVolume() { return engineVolume; }

}