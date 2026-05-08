abstract class Car {
    String model;
    String color;
    int maxSpeed;
    void gas() {
        System.out.println("Газуємо!");
    }
    abstract void brake();
}