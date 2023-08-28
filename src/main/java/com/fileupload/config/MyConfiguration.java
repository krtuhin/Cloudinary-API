package com.fileupload.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class MyConfiguration {

    //cloudinary configuration
    @Bean
    public Cloudinary getCloudinary() {

        Map config = Map.of(
                "cloud_name", "dwy7mbexb",
                "api_key", "353711729767454",
                "api_secret", "8s2aHdApY7byBh4wDQ8932fv3BY",
                "secure", true
        );

        return new Cloudinary(config);
    }
}
