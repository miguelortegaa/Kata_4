package kata_4;

import java.io.File;
import java.util.List;

public class Kata_4 {

    public static void main(String[] args) {
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        List<String> lines = loader.load();
        Histogram<String> histogram = new Histogram();
        for (String line : lines) {
            histogram.increment(line);
        }
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", histogram);
        histogramDisplay.execute();
    }
    
}
