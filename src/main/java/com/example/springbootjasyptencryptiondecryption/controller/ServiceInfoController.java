package com.example.springbootjasyptencryptiondecryption.controller;

import com.example.springbootjasyptencryptiondecryption.constant.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Service information controller.
 */
@RestController
@RequestMapping(value = "/")
public class ServiceInfoController {

    /**
     * Get service health check status.
     *
     * @return service status - String
     */
    @GetMapping
    public ResponseEntity<String> info() {
        return new ResponseEntity<>(AppConstants.SERVICE_IS_RUNNING.getMessage(), HttpStatus.OK);
    }
}
