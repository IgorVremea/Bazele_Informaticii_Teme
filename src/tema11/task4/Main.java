package tema11.task4;
// Sarcina:
//ˆIntr-o metod ̆a main, declarat ̧i mai multe variabile referint ̧ ̆a. Obligatoriu, toate
//variabilele vor avea acela ̧si tip declarat. Creat ̧i apoi mai multe avioane (cel
//put ̧in unul de fiecare fel). Pentru a referi aceste obiecte folosit ̧i doar variabilele
//amintite anterior bazˆandu-v ̆a pe mo ̧stenirea de tip. ˆIn continuare apelat ̧i
//diferitele operat ̧ii disponibile fiec ̆arui avion/fel de avion.
public class Main {
    public static void checkBasicAirplaneFunc(Avion avion){
        System.out.println('\n' + avion.getPlainID() + " (" + avion.getTotalEnginePower() + "N):");
        System.out.print('\t');
        avion.takeOff();
        System.out.print('\t');
        avion.fly();
        System.out.print('\t');
        avion.land();
    }

    public static void main(String[] args) {
        // Creem toate avioane cu același tip declarat
        Avion basic = new Avion("Avion Basic 1", 100000);
        Avion calator = new AvionCalator("Avion Calator 1", 300000, 400);
        Avion concorde = new AvionConcorde("Avion Calator Concorde 1", 1000000, 300);
        Avion deLupta = new AvionDeLupta("Avion de Lupta 1", 600000);
        Avion mig = new AvionMig("Avion de Lupta Mig 1", 550000);
        Avion tomCat = new AvionTomCat("Avion de Lupta TomCat 1", 400000);

        // Verificarea avioanelor:
        System.out.println("\n--------------------ACELASI TIP--------------------\n");
        checkBasicAirplaneFunc(basic);
        checkBasicAirplaneFunc(calator);
        checkBasicAirplaneFunc(concorde);
        checkBasicAirplaneFunc(deLupta);
        checkBasicAirplaneFunc(mig);
        checkBasicAirplaneFunc(tomCat);


        // Creem toate cate un avion de fiecare tip
        Avion basic1 = new Avion("Avion Basic 1", 100000);
        AvionCalator calator1 = new AvionCalator("Avion Calator 2", 300000, 400);
        AvionConcorde concorde1 = new AvionConcorde("Avion Calator Concorde 2", 1000000, 300);
        AvionDeLupta deLupta1 = new AvionDeLupta("Avion de Lupta 2", 600000);
        AvionMig mig1 = new AvionMig("Avion de Lupta Mig 2", 550000);
        AvionTomCat tomCat1 = new AvionTomCat("Avion de Lupta TomCat 2", 400000);

        // Verificarea avioanelor:
        System.out.println("\n--------------------TIPURILE DIFERITE--------------------\n");
        // Avion general
        checkBasicAirplaneFunc(basic1);

        // Avion calator general
        checkBasicAirplaneFunc(calator1);
        System.out.print("\tMax passengers: " + calator1.getMaxPassengers());

        // Avion calator Concorde
        checkBasicAirplaneFunc(concorde1);
        System.out.print("\t"); concorde1.goSuperSonic();
        System.out.print("\t"); concorde1.goSubSonic();

        // Avion de lupta general
        checkBasicAirplaneFunc(deLupta1);
        System.out.print("\t"); deLupta1.launchMissile();

        // Avion de lupta Mig
        checkBasicAirplaneFunc(mig1);
        System.out.print("\t"); mig1.highSpeedGeometry();
        System.out.print("\t"); mig1.normalGeometry();

        // Avion de lupta TomCat
        checkBasicAirplaneFunc(tomCat1);
        System.out.print("\t"); tomCat1.refuel();

    }
}
