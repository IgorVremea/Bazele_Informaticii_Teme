package tema14.task4;

import java.util.ArrayList;

public class Train {
    private ArrayList<Carriage> carriages = new ArrayList<>();

    public Train(){

    }
    public Train(ArrayList<Carriage> carriages) {
        this.carriages = carriages;
    }

    public Carriage getCarriageByIdInTrain(int id){
        return carriages.get(id);
    }

    public Carriage getCarriageByName(String name){
        for(Carriage carriage : carriages){
            if(carriage.getCarriageName().equals(name)) return carriage;
        }
        return null;
    }

    public void addCarriage(Carriage carriage){
        this.carriages.add(carriage);
    }

    public void removeCarriageById(int id){
        this.carriages.remove(id);
    }

    public int getCapacityOf(String characteristic){ // adun capacitatea pentru obiecte respective
        int temp = 0;
        for(Carriage carriage : carriages){ // scanez toate vagoane si adun capacitatea lor
            temp += carriage.getMaxCapacityOf(characteristic);
        }
        return temp;
    }
    public ArrayList<String> getCarriageTypes(){
        ArrayList<String> temp = new ArrayList<>();
        for(Carriage carriage : carriages){ // scanez toate vagoane si adaug tipurile care inca nu au aparut
            if(!temp.contains(carriage.getCarriageType())) temp.add(carriage.getCarriageType());
        }
        return temp;
    }
    public boolean equals(Train anotherTrain){
        return this.getCapacityOf("Colete") == anotherTrain.getCapacityOf("Colete");
    }
}
