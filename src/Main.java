import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                Scanner scr = new Scanner(System.in);
                System.out.print("Введите строку, не содержащую одну цифру: ");
                char[] arrayCharWithDigit = scr.nextLine().toCharArray();
                for (char character : arrayCharWithDigit) {
                    if (Character.isDigit(character))
                        throw new DigitException("Строка содержит цифру", Integer.parseInt(Character.toString(character)));
                }
                flag = false;
            } catch (DigitException de) {
                System.out.println(de.getMessage() + " " + de.getNumber());
            }
        }
    }
}
