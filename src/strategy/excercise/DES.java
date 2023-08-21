package strategy.excercise;

public class DES implements Encryption {
    @Override
    public boolean encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return true;
    }
}
