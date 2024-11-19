
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;


public class JasonObject {
    public static void main(String[] args) {
        String readFile = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\jasonFile";
        ObjectMapper mapper = new ObjectMapper();

        try(FileInputStream fileInputStream = new FileInputStream(readFile)){

            List<FileName> map = mapper.readValue(fileInputStream, new TypeReference <List<FileName>>() {});

            for(FileName fileName : map){
                if(fileName.getId()%2==0){
                    System.out.println(fileName);
                }
            }
                System.out.println(map);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
