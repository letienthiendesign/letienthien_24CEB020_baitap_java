package C46;

public class testAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("thu cung");
        System.out.println(animal);

        Mammal mammal = new Mammal("DV");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Doggo1");
        Dog dog2 = new Dog("Doggo2");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}

