package tema19.task4;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game("Red", "Blue");
        System.out.println("Game #1: ");
        game1.simulate();

        Game game2 = new Game("Blue", "Red");
        System.out.println("\nGame #2: ");
        game2.simulate();

        System.out.println("\n" + game1);
        System.out.println("\n" + game2);
    }
}
