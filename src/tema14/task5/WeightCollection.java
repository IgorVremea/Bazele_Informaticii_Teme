package tema14.task5;

import java.util.ArrayList;

public class WeightCollection {
    private ArrayList<Weight> weights;
    private int maxWeightCount;
    private int weightCount;

    public WeightCollection(int maxWeightCount){
        this(maxWeightCount, new ArrayList<>());
    }
    public WeightCollection(int maxWeightCount, ArrayList<Weight> weights){
        this.maxWeightCount = maxWeightCount;
        this.weights = weights;
        this.weightCount = weights.size();
        while(!(weights.size() <= maxWeightCount)) weights.remove(weights.size()-1);
    }

    public boolean addWeight(Weight weight){
        if(weightCount < maxWeightCount){
            weightCount++;
            weights.add(weight);
            return true;
        } else {
            return false;
        }
    }

    public int capacity(){
        int res = 0;
        for(Weight weight : weights){
            res += weight.capacity();
        }
        return res;
    }

    public double avg(){
        return this.capacity()/(double)weightCount;
    }
}
