import java.nio.charset.StandardCharsets;

public class Main4 {
    public static void main(String[] args) {
        String text = "hello everyone";
        String encoding = new String(text.getBytes(), StandardCharsets.US_ASCII);
        System.out.println(encoding);
    }
}
