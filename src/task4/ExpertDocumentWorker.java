package task4;

public class ExpertDocumentWorker extends ProDocumentWorker{
    private static String expertKey = "SASDK-12DDH-SDFH4-SD3FE-XPERT";

    public static String getExpertKey() {
        return expertKey;
    }

    void saveDocument() {
        System.out.println("Документ збережено в новому форматі");
    }
}
