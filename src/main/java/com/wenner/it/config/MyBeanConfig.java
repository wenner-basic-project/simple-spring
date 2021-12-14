package com.wenner.it.config;

import com.wenner.it.service.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {

    @Bean("carService")
    public CarService getCarService() {
        return new CarService();
    }
}
