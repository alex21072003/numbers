public class Main {
    public static void main(String[] args) {
        String hello = "hello";
        String str = "Это текстовая строка для подсчёта пробелов";
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                spaceCount++;

            }

        }
        System.out.println("колличество пробелов" + spaceCount);
        char firstChar = hello.charAt(hello.length());
        System.out.println(firstChar);
        System.out.println("первая буква:" + firstChar);
        char[] chars = hello.toCharArray();
        for (char c : chars){
            System.out.println(c);

        }
    }
}
