import java.util.Random;

public class Regbi {
    public static void main(String[] args) {
        Random random = new Random();
        int[] comA = new int[25];
        int[] comB = new int[25];
        double sumComA = 0;
        double sumComB = 0;
        System.out.print("Вік гравців команди \"Headless abobs\": ");
        for (int i = 0; i <= 24; i++) {
            int r = random.nextInt(18, 41);
            comA[i] = r;
            if (i < 24) {
                System.out.print(comA[i] + ", ");
            } else if (i == 24) {
                System.out.println(comA[i] + ";");
            }
            sumComA += comA[i];
        }
        double midComA = sumComA/comA.length;
        System.out.println("Середній вік гравців команди \"Headless abobs\": " + midComA + ".");

        System.out.print("Вік гравців команди \"Godzillas\": ");
        for (int j = 0; j <= 24; j++) {
            int r = random.nextInt(18, 41);
            comB[j] = r;
            if (j < 24) {
                System.out.print(comB[j] + ", ");
            } else if (j == 24) {
                System.out.println(comB[j] + ";");
            }
            sumComB += comB[j];
        }
        double midComB = sumComB/comB.length;
        System.out.println("Середній вік гравців команди \"Godzillas\": " + midComB + ".");
    }
}

