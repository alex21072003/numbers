import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) {
        String text = "hello";
        byte[] textBytes = text.getBytes("Windows-1251");
        for (byte textByte : textBytes) {
            System.out.print(textBytes + " ");
        }
    }catch(
    UnsupportedOperationException e)

    {
        throw new RuntimeException(e);
    }
}
}
