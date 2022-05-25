package lesson1.tasks.one;

import lombok.Data;

@Data
public class Fruit {
    String name;

    public static final class FruitBuilder {
        String name;

        public FruitBuilder() {
        }

        public static FruitBuilder aFruit() {
            return new FruitBuilder();
        }

        public FruitBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public Fruit build() {
            Fruit fruit = new Fruit();
            fruit.name = this.name;
            return fruit;
        }
    }
}
