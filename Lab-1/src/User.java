public class User {
    private final int id;
    private final int age;
    private final String firstName;
    private final String lastName;
    private final double weight;
    private final double height;

    public User(int id, int age, String firstName, String lastName, double weight, double height) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
}