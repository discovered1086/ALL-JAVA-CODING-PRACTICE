package com.kingshuk.appsecurity.utils;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SymmetricEncryptionUtils {

    private static final String AES="AES";

    public static SecretKey createSecretKey() throws NoSuchAlgorithmException {
        SecureRandom randomNumber = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
        keyGenerator.init(256, randomNumber);
        return keyGenerator.generateKey();
    }
}
