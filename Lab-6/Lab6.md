# Лабораторна робота №6

## Тема:
Робота з класами та спадкуванням у Java

## Мета роботи:
Отримати навики роботи з класами, методами, конструкторами та спадкуванням у мові Java.

---

# Завдання 1

## Клас Person

### Person.java

```java
class Person {
    String fullName;
    int age;

    Person() {}

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " рухається");
    }

    void talk() {
        System.out.println(fullName + " говорить");
    }
}
```

---

# Завдання 2

## Клас Phone

### Phone.java

```java
class Phone {
    String number;
    String model;
    double weight;

    Phone() {}

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Дзвонить " + name + " номер: " + number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String... numbers) {
        for (String num : numbers) {
            System.out.println("Повідомлення на: " + num);
        }
    }
}
```

---

# Завдання 3

## Абстрактний клас Car

### Car.java

```java
abstract class Car {
    String model;
    String color;
    int maxSpeed;

    void gas() {
        System.out.println("Газуємо!");
    }

    abstract void brake();
}
```

---

# Завдання 4

## Класи Sedan і Truck

### Sedan.java

```java
class Sedan extends Car {
    void brake() {
        System.out.println("Седан гальмує");
    }
}
```

### Truck.java

```java
class Truck extends Car {
    void brake() {
        System.out.println("Грузовик гальмує");
    }
}
```

---

# Завдання 5

## Клас Triangle

### Triangle.java

```java
import java.util.Scanner;

class Triangle {
    double a;
    double b;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введи a: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Помилка! Введи число:");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.print("Введи b: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Помилка! Введи число:");
            sc.next();
        }
        b = sc.nextDouble();
    }

    double gip() {
        return Math.sqrt(a * a + b * b);
    }

    void info() {
        System.out.println("Катети: " + a + ", " + b);
        System.out.println("Гіпотенуза: " + gip());
        System.out.println("sin: " + a / gip());
        System.out.println("cos: " + b / gip());
        System.out.println("tg: " + a / b);
    }
}
```

---

# Головний клас

## Main.java

```java
public class Main {
    public static void main(String[] args) {

        // Завдання 1
        Person p = new Person("Іван", 20);
        p.move();
        p.talk();

        System.out.println();

        // Завдання 2
        Phone ph = new Phone("123", "Samsung", 150);
        ph.receiveCall("Оля");
        System.out.println("Номер: " + ph.getNumber());

        System.out.println();

        // Завдання 3-4
        Sedan s = new Sedan();
        s.gas();
        s.brake();

        Truck t = new Truck();
        t.gas();
        t.brake();

        System.out.println();

        // Завдання 5
        Triangle tr = new Triangle();
        tr.input();
        tr.info();
    }
}
```

---

# Висновок

У ході лабораторної роботи було створено класи, конструктори та методи мовою Java. Було реалізовано принципи об’єктно-орієнтованого програмування: інкапсуляцію, спадкування та використання абстрактних класів.
