package Dog;

public class Yorkshire_terrier extends Dog{

    public Yorkshire_terrier(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public String paw() {
        int r;
        r = (int)(Math.random() * 2 );
        if (r == 0)
            return "Ничего не произошло";
        else
            return "Дал лапу";
    }

    @Override
    public String bark() {
        return "Тихий \"гав\"";
    }

    @Override
    public String info() {
        return "Порода йоркширский терьер\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nОкрас: " + getColor() +
                "\nВес: " + getWeight() + " кг";
    }
}
