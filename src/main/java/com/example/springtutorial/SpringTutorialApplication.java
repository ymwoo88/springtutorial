package com.example.springtutorial;

import com.example.springtutorial.config.TutorialConfig;
import com.example.springtutorial.service.TutorialService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringTutorialApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringTutorialApplication.class, args);

        TutorialService tutorialService = new TutorialService();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TutorialService.class);
        applicationContext.
        beanDefinitionBuilder.
        TutorialService tutorialService = applicationContext.getBean("tutorialService", TutorialService.class);
        tutorialService.sayHello();
    }

}
