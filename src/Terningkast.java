import java.util.Random;

public class Terningkast {
    public static void main(String[] args) {
        System.out.println("Outcome:");
        for (int i = 1; i <= 10; i++) {
            getDieRoll();
            System.out.println(getDieRoll());
        }
    }

    public static int getDieRoll() {
        Random random = new Random();
        int randInt = random.nextInt(1, 7);
        return randInt;
    }
}