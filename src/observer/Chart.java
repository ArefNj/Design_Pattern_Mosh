package observer;

public class Chart implements Observer {

    private final DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("chart updated " + dataSource.getValue());
    }
}
