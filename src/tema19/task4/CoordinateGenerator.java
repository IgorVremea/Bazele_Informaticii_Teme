package tema19.task4;

import java.util.Date;
import java.util.Random;

public class CoordinateGenerator {
    private Random randomGenerator;

    public CoordinateGenerator(){
        Date now = new Date();
        long sec = now.getTime();
        randomGenerator = new Random(sec);
    }

    public int generateX(){
        int x = randomGenerator.nextInt(101);
        if(x < 5){
            x = 0;
        } else if(x > 95){
            x = 100;
        } else {
            x = randomGenerator.nextInt(99) + 1;
        }
        return x;
    }

    public int generateY(){
        int y = randomGenerator.nextInt(51);
        if(y < 5){
            y = 0;
        } else if(y > 45){
            y = 50;
        } else {
            y = randomGenerator.nextInt(49) + 1;
        }
        return y;
    }
}
