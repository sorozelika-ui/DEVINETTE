import java.util.Random;
import java.util.Scanner;

public class Devinette {

    public static void main(String[] args) {

        // Génération du nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nb = random.nextInt(100) + 1;

        // Création du scanner
        Scanner scanner = new Scanner(System.in);

        int tentative = 10;

        System.out.println("Devinette");

           //10 tentatives de devienttes
        for (int i = 1; i <= tentative; i++) {

            System.out.println("Tentative " + i);
            System.out.println("Entrez votre nombre :");

            int grade = scanner.nextInt();

            if (grade == nb) {

                System.out.println("Wow ! Bien joué !");
                break;

            } else {

                if (grade > nb) {

                    System.out.println("Nombre trop grand");

                } else {

                    System.out.println("Nombre trop petit");
                }
            }


            if (i == tentative) {

                System.out.println("Pas mal, mais tu peux faire mieux la prochaine fois !");

            }
        }

        scanner.close();

    }
}