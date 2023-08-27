package chainOfResponsibility.exercise;

public class Excel extends DataReader {
    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");

    }
}
