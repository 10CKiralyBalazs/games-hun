import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        ArrayList<Games> jatekok = new ArrayList<>();
        try{
            File textFile = new File("games-hun.csv");
            Scanner scanner = new Scanner(textFile);

            while (scanner.hasNextLine()){
                String sor = scanner.nextLine();
                String[] oszlopok = sor.split(",");

                Games jatek = new Games(oszlopok[0], (oszlopok[1]), oszlopok[2],
                        Integer.parseInt(oszlopok[3]) , Integer.parseInt(oszlopok[4]),
                        Integer.parseInt(oszlopok[5]), Integer.parseInt(oszlopok[6]),
                        Integer.parseInt(oszlopok[7]), Integer.parseInt(oszlopok[8]));
                jatekok.add(jatek);
            }
            System.out.println(jatekok);
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("error");
        }
    }
}