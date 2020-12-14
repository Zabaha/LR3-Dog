package Dog;

public abstract class Dog {
    private String name;
    private String color;
    private int age;
    private int weight;
    public Dog(String name, String color, int age, int weight){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public abstract String paw();
    public abstract String bark();
    public abstract String info();
}
