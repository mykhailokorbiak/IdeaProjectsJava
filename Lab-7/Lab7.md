# Лабораторна робота №7

## Тема
Робота з колекціями в Java

---

## Мета роботи
Отримати практичні навички роботи з колекціями в Java.

---

# Хід роботи

## Завдання 1

### Умова
Створити сервіс таксі.

Створити:
- клас автомобіля;
- клас водія;
- список автомобілів ArrayList;
- helper-клас для вибору випадкового автомобіля.

Виконати:
- ремонт половини автомобілів;
- зміну водіїв;
- збільшення потужності та ціни;
- перевірку досвіду водіїв.

---

## Код програми

### Driver.java
```java
public class Driver {
    String name;
    int age;
    int exp;

    public Driver(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }
}
```

### Car.java
```java
public class Car {
    String brand;
    double power;
    Driver driver;
    double price;
    int year;

    public Car(String brand, double power, Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
}
```

### Helper.java
```java
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
```

### Main.java
```java
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

        System.out.println("=== Завдання 1 (Таксі) ===");
        Helper.showCar(randomCar);

        System.out.println("\n========================");
        System.out.println("ЗАВДАННЯ 2");
        System.out.println("========================");

        PhoneBook.run();
    }
}
```

## Завдання 2

### PhoneBook.java
```java
import java.util.HashMap;

public class PhoneBook {

    public static void run() {

        HashMap<String, String> book = new HashMap<>();

        book.put("Іваненко", "111111");
        book.put("Петренко", "222222");
        book.put("Сидоренко", "333333");
        book.put("Коваль", "444444");
        book.put("Шевченко", "555555");
        book.put("Бойко", "666666");
        book.put("Ткаченко", "777777");
        book.put("Кравченко", "888888");
        book.put("Олійник", "999999");
        book.put("Гнатюк", "000000");

        System.out.println("\n=== Телефонна книга ===");

        for (String key : book.keySet()) {
            System.out.println(key + " -> " + book.get(key));
        }

        String name = "Петренко";

        if (book.containsKey(name)) {
            System.out.println("\nЗнайдено: " + book.get(name));
        } else {
            System.out.println("\nУ книзі відсутній такий абонент");
        }

        if (book.containsValue("333333")) {
            System.out.println("\nНомер 333333 є у книзі");
        }

        book.remove("Іваненко");

        System.out.println("\nКількість записів: " + book.size());
    }
}
```

# Висновок

У ході лабораторної роботи було отримано практичні навички роботи з колекціями Java.
Було використано ArrayList, HashMap, класи, об’єкти та методи.
