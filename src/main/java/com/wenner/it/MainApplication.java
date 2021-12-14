package com.wenner.it;

import com.wenner.it.config.MyBeanConfig;
import com.wenner.it.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext act = new AnnotationConfigApplicationContext(MyBeanConfig.class);

        CarService carService = (CarService) act.getBean("carService");
        System.out.println(carService.productionCar("benz", "blue"));

    }


}
