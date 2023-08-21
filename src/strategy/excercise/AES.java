package strategy.excercise;

public class AES implements Encryption {
    @Override
    public boolean encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return true;
    }
}
