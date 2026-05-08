package tema14.task4;

import java.util.ArrayList;

// https://classroom.google.com/u/0/c/ODI1ODY1NzE5NDA1/a/ODI1ODY1NzE5NDcy/details
public class Main {
    public static void main(String[] args) {
        // Train #1     \/
        Train train1 = new Train();
        train1.addCarriage(new TravelA("CalatoriA #1"));
        train1.addCarriage(new TravelB("CalatoriB #1"));
        train1.addCarriage(new Cargo("Marfa #1"));
        // Train #2     \/
        Train train2 = new Train();
        train2.addCarriage(new Cargo("Marfa #2"));
        train2.addCarriage(new TravelB("CalatoriB #2"));
        train2.addCarriage(new TravelA("CalatoriA #2"));
        train2.addCarriage(new Cargo("Marfa #3"));

        // Comment - Uncomment teste \/
        System.out.println(train1.equals(train2));
        System.out.println(train1.getCarriageTypes());
        System.out.println(train2.getCarriageTypes());
        System.out.println(train1.getCapacityOf("Pasageri"));
        System.out.println(train2.getCarriageByIdInTrain(1).getCarriageName());
        System.out.println(train2.getCarriageByName("CalatoriB #2").getMaxCapacityOf("Pasageri"));



    }
}
