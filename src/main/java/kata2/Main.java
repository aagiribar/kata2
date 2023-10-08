package kata2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VideogameLoader loader = new CsvFileVideogameLoader(new File("vgsales.csv"));
        List<Videogame> videogames = loader.load();
        System.out.println(videogames.get(0));
    }
}
