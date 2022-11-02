package creational;

public class Main {

    public static void main(String[] args) throws Exception {

        // Expected usage => All should give the same result as above
        BookMetadataExporter bookExporter = new JSONBookMetadataExporter();
        bookExporter.add(TestData.sailboatBook);
        bookExporter.add(TestData.GoFBook);
        bookExporter.export(System.out);
    }
}