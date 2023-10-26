package com.example.springbootjasyptencryptiondecryption.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI 3 Swagger Specification Configuration.
 */
@Configuration
public class OpenAPI3SwaggerConfig {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${spring.profile.active}")
    private String appProfile;

    @Bean
    public OpenAPI customAPI() {

        Contact contact = new Contact();
        contact.setName("OpenAPI3 Example Application");
        contact.url("www.google.com");
        contact.email("test@email.com");

        Info info = new Info()
                .title((StringUtils.join(appName, " - ", StringUtils.upperCase(appProfile))))
                .description("Spring boot sample application to demonstrate encryption and decryption using Jasypt")
                .version("1.0")
                .contact(contact)
                .license(new License().name("My Application 1.0").url("www.google.com"));

        return new OpenAPI().info(info).servers(List.of());
    }
}
