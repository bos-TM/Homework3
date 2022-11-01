package task6;

public class PrinterGreen extends Printer{
    public void print(String value){
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
