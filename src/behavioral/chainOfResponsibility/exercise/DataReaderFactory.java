package behavioral.chainOfResponsibility.exercise;

public class DataReaderFactory {
    public DataReader run() {
        var excel = new Excel();
        var numbers = new Numbers();
        var quickBook = new QuickBook();

        excel.setNext(numbers);
        numbers.setNext(quickBook);
        return excel;
    }
}
