package lesson7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cat {
    public String name;
    public int appetite;
    public boolean fullness;

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

}
