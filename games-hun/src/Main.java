import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Games> jatekok = new ArrayList<>();

        try {
            File textFile = new File("games-hun.csv");
            Scanner scanner = new Scanner(textFile);

            System.out.println("Fájl tartalma");


            ArrayList<String> sorok = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                System.out.println(sor);
                sorok.add(sor);
            }
            scanner.close();


            for (int i = 1; i < sorok.size(); i++) {
                String sor = sorok.get(i).trim();
                if (sor.isEmpty()) continue;

                String[] o = sor.split(",");

                Games jatek = new Games(
                        o[0],
                        o[1],
                        o[2],
                        Integer.parseInt(o[3]),
                        Float.parseFloat(o[4]),
                        Integer.parseInt(o[5]),
                        Integer.parseInt(o[6]),
                        Integer.parseInt(o[7]),
                        Integer.parseInt(o[8])
                );

                jatekok.add(jatek);
            }

            System.out.println("\nJátékok");
            for (Games g : jatekok) {
                System.out.println(g);
            }

        } catch (FileNotFoundException e) {
            System.out.println("A fájl nem található.");
        }
    }
}
