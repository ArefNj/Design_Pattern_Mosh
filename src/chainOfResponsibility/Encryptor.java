package chainOfResponsibility;

public class Encryptor extends  Handler{
    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("encryption");
        return false;
    }
}
