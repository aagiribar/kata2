package kata2;

import java.io.File;
import java.util.List;

public class CsvFileVideogameLoader implements VideogameLoader{
    private File file;

    public CsvFileVideogameLoader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    @Override
    public List<Videogame> load() {
        return null;
    }
}
