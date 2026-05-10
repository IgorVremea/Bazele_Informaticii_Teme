package tema14.task5;

import java.util.ArrayList;

public class MultipleWeight extends Weight{
    private ArrayList<Weight> weights;

    public MultipleWeight(ArrayList<Weight> weights){
        this.weights = weights;
    }

    @Override
    public int capacity() {
        int res = 0;
        for(Weight weight : weights){
            res += weight.capacity();
        }
        return res;
    }
}
