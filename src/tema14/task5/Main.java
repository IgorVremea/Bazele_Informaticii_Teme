package tema14.task5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WeightCollection weightCollection = new WeightCollection(5, new ArrayList<>(List.of(
                new SimpleWeight(20),
                new SimpleWeight(5),
                new DoubleWeight(
                        new SimpleWeight(10),
                        new SimpleWeight(100)
                ),
                new MultipleWeight(new ArrayList<>(List.of(
                        new SimpleWeight(200),
                        new DoubleWeight(
                                new SimpleWeight(1),
                                new DoubleWeight(
                                        new SimpleWeight(100),
                                        new SimpleWeight(4)
                                )
                        )
                )))
        )));
        weightCollection.addWeight(new SimpleWeight(303));
        weightCollection.addWeight(new SimpleWeight(100));  // adaug in plus
        weightCollection.addWeight(new SimpleWeight(100));  // adaug in plus
        weightCollection.addWeight(new SimpleWeight(100));  // adaug in plus

        System.out.println(weightCollection.capacity());
        System.out.println(weightCollection.avg());
    }
}
