package pres;

import deo.Ideo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        // Lecture du fichier config.txt pour obtenir le nom de la classe
        Scanner scanner = new Scanner(new File("chemin/vers/config.txt"));
        String doaClassName = scanner.nextLine();

        // Chargement de la classe et création d'une instance
        Class<?> cDoa = Class.forName(doaClassName);
        Ideo dao = (Ideo) cDoa.getDeclaredConstructor().newInstance(); // Correction ici

        // Appel de la méthode getData() et affichage du résultat
        System.out.println(dao.getData());
    }
}