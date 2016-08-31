package my.sample.securerandom;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomAlgChecker {

    public static void main(String[] args) throws Exception {

        try {
            SecureRandom random = SecureRandom.getInstanceStrong();
            System.out.println("SecureRandom.getInstanceStrong() = " + random.getAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
