package kata_4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmailLoader implements Loader {
    private final Loader loader;
    private static final Pattern emailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    

    public EmailLoader(Loader Loader) {
        this.loader = Loader;
    }

    @Override
    public List load() {
        List<String> list = new ArrayList<>();
        List<String> lines = this.loader.load();
        for (String line:lines) {
            if (isEmail(line)) list.add(line); 
        }
        return list;
    }

    private boolean isEmail(String line) {
        return emailPattern.matcher(line).matches();
    }
    
}
