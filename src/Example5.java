import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\cat.json";
        ObjectMapper mapper = new ObjectMapper();
       // mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try{
            FileInputStream fileInputStream = new FileInputStream(filename);
            Cat cat = mapper.readValue(fileInputStream, Cat.class);
            System.out.println("Name: " + cat.getName() + "Age: " + cat.getAge());
        }catch(IOException e){
            throw new RuntimeException(e);

        }
    }
}
