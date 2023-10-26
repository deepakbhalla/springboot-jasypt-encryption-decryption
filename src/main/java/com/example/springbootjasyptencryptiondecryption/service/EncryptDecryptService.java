package com.example.springbootjasyptencryptiondecryption.service;

import com.example.springbootjasyptencryptiondecryption.model.EncryptDecryptResponse;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncryptDecryptService {

    @Autowired
    private StringEncryptor encryptor;

    public EncryptDecryptResponse encryptDecrypt(String input) {
        String encrypted = this.encryptor.encrypt(input);
        return EncryptDecryptResponse.builder()
                .original(input)
                .encrypted(encrypted)
                .decrypted(this.encryptor.decrypt(encrypted))
                .build();
    }
}
