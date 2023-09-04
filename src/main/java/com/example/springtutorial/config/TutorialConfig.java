package com.example.springtutorial.config;

import com.example.springtutorial.service.TutorialService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TutorialConfig {

    @Bean
    public TutorialService tutorialService() {
        return new TutorialService();
    }
}
