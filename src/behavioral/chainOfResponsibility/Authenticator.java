package behavioral.chainOfResponsibility;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("authenticate");
        var isValid = (request.getUsername() == "Admin" && request.getPassword() == "1234");

        return  !isValid;
    }
}
