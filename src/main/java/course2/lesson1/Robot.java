package course2.lesson1;

import lombok.Data;

@Data
public class Robot implements Action {

    Long maxRun = 1000L;
    Long maxJump = 0L;


    @Override
    public boolean run(Long aLong) {
        if (aLong <= maxRun) {
            System.out.println("Робот бежит ");
            return true;
        }
        return false;
    }

    @Override
    public boolean Jump(Long height) {
        if (height <= maxJump) {
            System.out.println("Робот прыгнул ");
            return true;
        }
        return false;
    }
}
