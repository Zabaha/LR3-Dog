package Dog;

public class Fox_terrier extends Dog{

    public Fox_terrier(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public String paw() {
        return "Дал лапу";
    }

    @Override
    public String bark() {
        return "Гав!";
    }

    @Override
    public String info() {
        return "Порода фокстерьер\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nОкрас: " + getColor() +
                "\nВес: " + getWeight() + " кг";
    }
}
