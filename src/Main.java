import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scr = new Scanner(System.in);
            System.out.print("Введите строку, содержащую одну цифру: ");
            char[] arrayCharWithDigit = scr.nextLine().toCharArray();
            for (char character: arrayCharWithDigit) {
                if (Character.isDigit(character)) throw new DigitException("Строка содержит цифру", Integer.parseInt(Character.toString(character)));
            }
        }catch (DigitException de){
            System.out.print(de.getMessage()+ " " + de.getNumber());
        }
    }
}
