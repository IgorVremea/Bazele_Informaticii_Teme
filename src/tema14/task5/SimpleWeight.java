package tema14.task5;

public class SimpleWeight extends Weight{
    private int weight;
    public static int countWeights = 0;

    public SimpleWeight(int weight){
        this.weight = weight;
        countWeights++;
    }

    @Override
    public int capacity() {
        return this.weight;
    }
}
