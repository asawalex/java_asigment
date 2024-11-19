import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        Cat cat = new Cat("my cat",4);
        ObjectMapper objectMapper = new ObjectMapper();

        try{
        objectMapper.writeValue(new File("empty"),cat);

        }catch(IOException e){

            System.out.println(e.getMessage());
        }
    }

}
