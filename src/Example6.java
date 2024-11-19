import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        Cat cat = new Cat("king",22);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String filename = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\cat.json";

        try(FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            mapper.writeValue(fileOutputStream, cat);

        }catch(IOException e) {
            throw new RuntimeException(e);

        }

    }
}
