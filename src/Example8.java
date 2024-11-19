import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Example8 {
    public static void main(String[] args) {
         String file = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\transaction.json";
         BigDecimal value = addAllTransactions(file);
         System.out.println(value);
       listTransaction();
    }

    public static void listTransaction(){
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction(2, BigDecimal.valueOf(1000.00), LocalDateTime.now()));
        list.add(new Transaction(3, BigDecimal.valueOf(2000.00), LocalDateTime.now()));
        list.add(new Transaction(4, BigDecimal.valueOf(3000.00), LocalDateTime.now()));
        list.add(new Transaction(5, BigDecimal.valueOf(4000.00), LocalDateTime.now()));
        addTransactions(list);

        }

    public static void addTransactions(List<Transaction> transactions){
        String files = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\transaction.json";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try(FileWriter file = new FileWriter(files)){
            objectMapper.writeValue(file,transactions);

        }catch(IOException e){
            throw new RuntimeException(e);

        }

    }
    public static BigDecimal addAllTransactions(String file){

        ObjectMapper objectMapper = new ObjectMapper();
        BigDecimal sum = BigDecimal.valueOf(0.0);

        try(FileInputStream files = new FileInputStream(file)){
           List<Transaction_Josn> transactionJson = objectMapper.readValue(files, new TypeReference<List<Transaction_Josn>>(){});
            for(Transaction_Josn transaction : transactionJson){
                sum = sum.max(transaction.getAmount());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return sum;
    }
//    public static void listTransactions(){
//        List<Transaction_Josn> list = new ArrayList<>();
//        list.add(new Transaction_Josn(1,"wale",BigDecimal.valueOf(3000),"ola","make payment",LocalDateTime.now()));
//        list.add(new Transaction_Josn(2,"sam",BigDecimal.valueOf(4000),"ola","make payment",LocalDateTime.now()));
//        addAllTransactions2(list);
//    }
//    public static int addAllTransactions2() {
//
//        String file = "C:\\Users\\DELL\\IdeaProjects\\ClassWork\\src\\transaction.jason";
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try (FileReader listOfFile = new FileReader(file)) {
//            List<Transaction_Josn> transactionJsons = objectMapper.readValue(listOfFile, new TypeReference<List<Transaction_Josn>>(){});
//            for(Transaction_Josn transaction : transactionJsons) {
//                if(transaction.getId())
//                    System.out.println(transaction);
//            }
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
//       return transaction;
   }
