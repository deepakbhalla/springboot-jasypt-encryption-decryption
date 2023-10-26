package com.example.springbootjasyptencryptiondecryption;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringbootJasyptEncryptionDecryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJasyptEncryptionDecryptionApplication.class, args);
	}
}
