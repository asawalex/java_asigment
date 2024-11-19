import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    public static void main(String[] args) {

        String pathLocation = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\example.txt";
        Path location = Path.of(pathLocation);

        try{
            var file = Files.size(location);
            System.out.println(file);
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
