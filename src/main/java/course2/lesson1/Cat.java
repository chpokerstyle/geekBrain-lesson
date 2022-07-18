package course2.lesson1;

import lombok.Data;

@Data
public class Cat implements Action {

    Long maxRun = 400L;
    Long maxJump = 20L;

    @Override
    public boolean run(Long aLong) {
        if (aLong <= maxRun) {
            System.out.println("Кот бежит ");
            return true;
        }
        return false;
    }

    @Override
    public boolean Jump(Long height) {
        if (height <= maxJump) {
            System.out.println("Кот прыгнул ");
            return true;
        }
        return false;
    }
}
