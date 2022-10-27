package kata_4;

import java.io.File;
import java.util.List;

public class Kata_4 {

    public static void main(String[] args) {
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        List<String> lines = loader.load();
        for (String line : lines) {
            System.out.println(line);
        }
    }
    
}
