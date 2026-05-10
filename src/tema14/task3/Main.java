package tema14.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Taxpayer jhonDeer = new Taxpayer("Jhon Deer", "1234567890123");
        jhonDeer.addProperty(new Building(new Address("Strada V Parvan", 2), 20));
        jhonDeer.addProperty(new Field(new Address("Strada V. Parvan", 10), 10, Rang.I));
        jhonDeer.addProperty(new Building(new Address("Strada Lugoj", 4), 25));

        ArrayList<Taxpayer> taxpayers = new ArrayList<>();
        taxpayers.add(jhonDeer);
        Operator ghiseu = new Operator(taxpayers);

        System.out.println(ghiseu.printTicket(jhonDeer));

    }
}
