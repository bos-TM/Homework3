package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentWorker worker;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть номер реєстраційного ключа: ");
        String key = input.nextLine();
        String proKey = ProDocumentWorker.getProKey();
        String expKey = ExpertDocumentWorker.getExpertKey();

        if (key.equals(proKey)) {
            worker = new ProDocumentWorker();
        } else if (key.equals(expKey)) {
            worker = new ExpertDocumentWorker();
        } else {
            worker = new DocumentWorker();
        }

        worker.saveDocument();
    }
}
