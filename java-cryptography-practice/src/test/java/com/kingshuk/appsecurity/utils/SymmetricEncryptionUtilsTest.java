package com.kingshuk.appsecurity.utils;

import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import javax.xml.bind.DatatypeConverter;
import java.security.NoSuchAlgorithmException;

import static org.assertj.core.api.Assertions.assertThat;


class SymmetricEncryptionUtilsTest {

    @Test
    void createSecretKey() throws NoSuchAlgorithmException {
        SecretKey secretKey = SymmetricEncryptionUtils.createSecretKey();
        assertThat(secretKey).isNotNull();
        System.out.println(DatatypeConverter.printHexBinary(secretKey.getEncoded()));
    }
}