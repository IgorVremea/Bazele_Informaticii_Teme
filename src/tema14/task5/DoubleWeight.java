package tema14.task5;

public class DoubleWeight extends Weight{
    private Weight weight1, weight2;

    public DoubleWeight(){
        this(new SimpleWeight(0), new SimpleWeight(0));
    }

    public DoubleWeight(Weight weight1, Weight weight2){
        this.weight1 = weight1;
        this.weight2 = weight2;
    }

    public void setWeight1(Weight weight1) {
        this.weight1 = weight1;
    }

    public void setWeight2(Weight weight2) {
        this.weight2 = weight2;
    }

    @Override
    public int capacity() {
        return weight1.capacity() + weight2.capacity();
    }
}
