package lesson7;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Plate {
    public int food;

    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
