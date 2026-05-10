package tema14.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Taxpayer johnDeer = new Taxpayer("John Deer", "1234567890123");
        johnDeer.addProperty(new Building(new Address("Strada V Parvan", 2), 20));
        johnDeer.addProperty(new Field(new Address("Strada V. Parvan", 10), 10, Rang.I));
        johnDeer.addProperty(new Building(new Address("Strada Lugoj", 4), 25));

        ArrayList<Taxpayer> taxpayers = new ArrayList<>();
        taxpayers.add(johnDeer);
        Operator ghiseu = new Operator(taxpayers);

        System.out.println(ghiseu.printTicket("1234567890123"));
//        System.out.println(ghiseu.printTicket("John Deer"));
//        System.out.println(ghiseu.printTicket(johnDeer));

    }
}
