import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;

public class Example2a {
    public static void main(String[] args) {

        String location = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\MyStore\\";
        String filename = location.concat("file");
        String file = "I love my life";

        try (OutputStream outFile = new FileOutputStream(filename, true)) {
            outFile.write(file.getBytes());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
