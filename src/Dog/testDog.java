package Dog;

public class testDog {

    public static void main(String[] args) {
        Spaniel d1 = new Spaniel("Чарли", "черно-белый", 5, 16);
        System.out.println(d1.info());
        System.out.println(d1.bark());
        System.out.println(d1.paw());
        Fox_terrier d2 = new Fox_terrier("Роберт", "белый с рыжим", 2, 7);
        System.out.println(d2.info());
        System.out.println(d2.bark());
        System.out.println(d2.paw());
        Yorkshire_terrier d3 = new Yorkshire_terrier("Марсель", "серо-черный", 9, 3);
        System.out.println(d3.info());
        System.out.println(d3.bark());
        System.out.println(d3.paw());
        System.out.println(d3.paw());
    }
}
