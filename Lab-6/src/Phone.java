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