package Dog;

public class Spaniel extends Dog {

    public Spaniel(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public String paw() {
        return "Дал обе лапы";
    }

    @Override
    public String bark() {
        return "ГАВ-ГАВ!";
    }

    @Override
    public String info() {
        return "Порода спаниель\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nОкрас: " + getColor()
                + "\nВес: " + getWeight() + " кг";
    }
}
