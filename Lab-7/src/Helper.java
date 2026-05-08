import java.util.ArrayList;
import java.util.Random;
public class Helper {
    public static Car getRandomCar(ArrayList<Car> cars) {
        Random rand = new Random();
        return cars.get(rand.nextInt(cars.size()));
    }
    public static void showCar(Car car) {
        System.out.println("Автомобіль " + car.brand +
                " з водієм " + car.driver.name + " виїхав за вами");
        System.out.println("Водій " + car.driver.name + " прибув на місце");
    }
}