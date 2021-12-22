public class DigitException extends Exception{
    private int number;

    public int getNumber(){return number;}

    public DigitException(String message, int num){

        super(message);
        number=num;
    }
}
