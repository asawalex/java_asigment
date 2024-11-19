
    public class ClassWorks {
        public static void main(String[] args) {


            String phoneNumber = "0818387245";
            String match = "[0-9{11}]+";
            boolean check = phoneNumber.matches(match);
            System.out.print(check);
        }
    }


