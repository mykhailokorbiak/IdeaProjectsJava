public class Task4 {
    public static void run() {
        Car[] cars = new Car[10];
        cars[0] = new Car(150, 2.0, "VW", "Jetta", 2014, "білий", "бензин");
        cars[1] = new Car(200, 3.0, "BMW", "X5", 2016, "чорний", "дизель");
        cars[2] = new Car(110, 1.6, "Toyota", "Corolla", 2012, "сірий", "бензин");
        cars[3] = new Car(90, 1.4, "Renault", "Megane", 2010, "синій", "бензин");
        cars[4] = new Car(300, 4.4, "Audi", "Q7", 2018, "чорний", "бензин");
        cars[5] = new Car(70, 1.2, "Skoda", "Fabia", 2009, "зелений", "бензин");
        cars[6] = new Car(180, 2.5, "Mazda", "6", 2015, "червоний", "бензин");
        cars[7] = new Car(140, 2.0, "Ford", "Mondeo", 2013, "срібний", "дизель");
        cars[8] = new Car(250, 3.5, "Mercedes", "E", 2017, "сірий", "бензин");
        cars[9] = new Car(100, 1.6, "Hyundai", "Elantra", 2011, "білий", "бензин");

        int totalPower = 0;
        double totalVolume = 0;

        for (Car car : cars) {
            totalPower += car.getPower();
            totalVolume += car.getEngineVolume();
        }

        System.out.println("Завдання 4");
        System.out.println("Сума потужностей = " + totalPower);
        System.out.println("Сума об’ємів двигуна = " + totalVolume);
        System.out.println();
    }
}