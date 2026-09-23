import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        System.out.println("Tu as choisi : " + nombre);

        int secret = (int)(Math.random() * 100) + 1;
        int essais = 0;

        boolean running = true;

        while (running) {
            if (nombre > secret) {
                System.out.println("Plus Petit");
                nombre = scanner.nextInt();
                essais += 1;
            } else if (nombre < secret) {
                System.out.println("Plus Grand");
                nombre = scanner.nextInt();
                essais += 1;
            } else {
                System.out.println("Vous avez trouvé le nombre mystère");
                System.out.println("Vous avez " + essais + " tentatives");
                running = false;
            }
        }
    }
}