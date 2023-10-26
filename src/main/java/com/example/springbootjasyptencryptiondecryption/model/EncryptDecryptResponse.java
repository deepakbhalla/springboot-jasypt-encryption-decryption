package com.example.springbootjasyptencryptiondecryption.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EncryptDecryptResponse {

    private String original;
    private String encrypted;
    private String decrypted;
}
