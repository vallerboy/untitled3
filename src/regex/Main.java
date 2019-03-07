package regex;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //123123123
        //123-113-213 (pauzy sa opcjonalne)
        //+48123-123-123 (pauzy są opcjonalne)
        //0048213-123-213 (00 lub +48 są zamienne)

        System.out.println(Pattern.matches("[1-9]{9}", "1"));
        System.out.println(Pattern.matches("([1-9]{3}-?){2}[1-9]{3}", "1"));
        System.out.println(Pattern.matches("(00|\\+48)([1-9]{3}-?){2}[1-9]{3}", "1"));

        if(!Pattern.matches("cos", "cos")){
            System.out.println("Helo");
            //break;
        }
    }
}
