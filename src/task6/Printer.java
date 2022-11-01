package task6;

public class Printer {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public void print(String value){
        System.out.println(value);
    }
}
