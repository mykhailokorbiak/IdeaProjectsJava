public class Main {
    public static void main(String[] args) {
        Person p = new Person("Іван", 20);
        p.move();
        p.talk();
        System.out.println();
        Phone ph = new Phone("123", "Samsung", 150);
        ph.receiveCall("Оля");
        System.out.println("Номер: " + ph.getNumber());
        System.out.println();
        Sedan s = new Sedan();
        s.gas();
        s.brake();
        Truck t = new Truck();
        t.gas();
        t.brake();
        System.out.println();
        Triangle tr = new Triangle();
        tr.input();
        tr.info();
        System.out.println();
        ColorTriangle ctr = new ColorTriangle(5, 12, "червоний", "Мій");
        ctr.info();
    }
}