public class Main2 {
    public static void main(String[] args) {
        String text = "1990 year";
        if(Character.isDigit(text.charAt(0))){
            System.out.println("this is a digit");
        }else {
            System.out.println("this is not digit");
        }
    }
}
