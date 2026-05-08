import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Driver d = new Driver("Driver" + i, 20 + i, i);
            cars.add(new Car(
                    "Car" + i,
                    100.0 + i * 10,
                    d,
                    10000.0 + i * 1000,
                    2010 + i
            ));
        }
        for (int i = 0; i < cars.size() / 2; i++) {
            cars.get(i).power *= 1.1;
            cars.get(i).driver = new Driver("NewDriver" + i, 30, 5);
        }
        for (int i = 0; i < cars.size(); i += 2) {
            cars.get(i).power *= 1.1;
            cars.get(i).price *= 1.05;
        }
        for (Car c : cars) {
            if (c.driver.exp < 5 && c.driver.age > 25) {
                c.driver.exp += 1;
            }
        }
        Car randomCar = Helper.getRandomCar(cars);
        System.out.println(" Завдання 1 (Таксі)");
        Helper.showCar(randomCar);
        System.out.println("\nЗАВДАННЯ 2");
        PhoneBook.run();
    }
}