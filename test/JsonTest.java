import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonTest {
    @Test
    public void testTheTransaction(){
        String file = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\transaction.json";
        BigDecimal amount = Example8.addAllTransactions(file);
        assertEquals(BigDecimal.valueOf(6000.0), amount);
    }
}

//        String file = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\transaction_json.json";
//        ObjectMapper mapper = new ObjectMapper();
//        Transaction_Josn transactionJosn = new Transaction_Josn();
//
//        try(FileWriter fileReader = new FileWriter(file)){
//             mapper.writeValue(fileReader,transactionJosn);
//
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
//    }
//}
