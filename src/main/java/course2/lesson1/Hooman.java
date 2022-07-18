package course2.lesson1;

import lombok.Builder;
import lombok.Data;

@Data
public class Hooman implements Action {

    Long maxRun = 1000L;
    Long maxJump = 10L;

    @Override
    public boolean run(Long aLong) {
        if (aLong <= maxRun) {
            System.out.println("Человек бежит ");
            return true;
        }
        return false;
    }

    @Override
    public boolean Jump(Long height) {
        if (height <= maxJump) {
            System.out.println("Человек прыгнул ");
            return true;
        }
        return false;
    }
}
