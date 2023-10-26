package com.example.springbootjasyptencryptiondecryption.controller;

import com.example.springbootjasyptencryptiondecryption.model.EncryptDecryptResponse;
import com.example.springbootjasyptencryptiondecryption.service.EncryptDecryptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Encrypt and decrypt using Jasypt
 */
@Tag(name = "Jasypt Controller", description = "Jasypt Controller APIs")
@RestController
public class JasyptController {

    @Autowired
    EncryptDecryptService service;

    /**
     * Encrypt and decrypt using Jasypt.
     *
     * @param input - String
     * @return EncryptDecryptResponse
     */
    @Operation(summary = "Get encrypted and decrypted values")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Encryption and decryption completed",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = EncryptDecryptResponse.class)) })})
    @GetMapping(value = "/jasypt/input/encrypt/decrypt/{input}")
    public ResponseEntity<EncryptDecryptResponse> encryptDecryptInput(@PathVariable("input") String input) {
        EncryptDecryptResponse response = this.service.encryptDecrypt(input);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
