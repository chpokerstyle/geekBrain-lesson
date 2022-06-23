package course2.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainC1L1 {
    public static void main(String[] args) {

        Action hooman = new Hooman();
        Action cat = new Cat();
        Action robot = new Robot();
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();

        List<Action> participant = new ArrayList<>();
        List<Object> event = new ArrayList<>();
        participant.add(hooman);
        participant.add(cat);
        participant.add(robot);
        event.add(wall);
        event.add(treadmill);

        participant.stream().forEach(a-> {
            if(a.Jump(wall.getHeight())==true){
                System.out.println("участник перепрыгнул ");
                if (a.run(treadmill.aLong)==true){
                    System.out.println("и пробежал");
                }else {
                    System.out.println("но не пробежал");
                }
            }else {
                System.out.println("участник не пробежал");
            }
        });
    }
}
