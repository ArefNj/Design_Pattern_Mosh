package strategy.exercise;

public class ChatClient {
    private final Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        if (!encryptionAlgorithm.encrypt(message)) {
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }
        System.out.println("Sending the encrypted message...");
    }
}
