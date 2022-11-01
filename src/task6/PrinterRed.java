package task6;

public class PrinterRed extends Printer{
    public void print(String value){
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}
