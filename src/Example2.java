import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {

        String newLocation = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\assets\\";
       String newFile = newLocation.concat("myFile");
        try(FileInputStream file = new FileInputStream(newFile)){
            byte[] files = file.readAllBytes();
            System.out.println(Arrays.toString(files));
        }catch(IOException e){
            throw new RuntimeException(e);

        }
    }
}
