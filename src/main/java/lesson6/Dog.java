package lesson6;


public class Dog extends Animal {
    Animal animal = new Animal();
    @Override
    public void swim(int distance) {
        var maxDistance = animal.maxDistance = 10;
        if (distance> maxDistance){
            System.out.println("Пёс проплыл " + maxDistance + " метров");
        }
        System.out.println("Пёс проплыл " + distance + " метров");
    }

    @Override
    public void run(int distance) {
        var maxDistance = animal.maxDistance = 500;
        if (distance> maxDistance){
            System.out.println("Пёс пробежал " + maxDistance + " метров");
        }
        System.out.println("Пёс пробежал " + distance + " метров");
    }
}
