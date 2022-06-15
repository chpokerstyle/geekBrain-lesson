package lesson6;


public class Cat extends Animal{
    Animal animal = new Animal();

    @Override
    public void swim(int distance) {
        var maxDistance = animal.maxDistance = 0;
        if (distance>maxDistance){
            System.out.println("Коты не умеют плавать ");
        }
    }

    @Override
    public void run(int distance) {
        var maxDistance = animal.maxDistance = 200;
        if (distance> maxDistance){
            System.out.println("Кот пробежал " + maxDistance + " метров");
        }else {
            System.out.println("Кот пробежал " + distance + " метров");
        }
    }
}
