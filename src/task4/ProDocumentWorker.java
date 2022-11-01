package task4;

public class ProDocumentWorker extends DocumentWorker {

    private static String proKey = "SSDK-12DDH-SDFH4-SD3F4-0SPRO";

    public static String getProKey() {
        return proKey;
    }

    void editDocument() {
        System.out.println("Документ відредаговано");
    }

    void saveDocument() {
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
