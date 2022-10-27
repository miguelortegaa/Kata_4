package kata_4;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader implements Loader {
    private final File file;
    
    public FileLoader(File file) {
        this.file = file;
    }

    @Override
    public List load() {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                list.add(line);
            }
            return list;
        } catch (IOException ex) {return null;}
    }
    
}
