package behavioral.chainOfResponsibility.exercise;

public abstract class DataReader {

    private DataReader next;


    public void read(String fileName) {

        if (fileName.endsWith(getExtension())) {
            doRead(fileName);
            return;
        }

        if (next != null) next.read(fileName);
        else System.out.println("File format not supported.");


    }

    protected abstract String getExtension();

    protected abstract void doRead(String fileName);

    public DataReader getNext() {
        return next;
    }

    public void setNext(DataReader next) {
        this.next = next;
    }
}
