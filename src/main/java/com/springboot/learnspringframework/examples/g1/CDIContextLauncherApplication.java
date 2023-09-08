package com.springboot.learnspringframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component // instead of using @Component can use @Named in Jakarta
@Named
class BusinessService{
    private DataService dataService;

//    generate getter and setter for DataService
//    Central injection
//    @Autowired // instead of using @Autowired can use @Inject
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection would be performed");
        this.dataService = dataService;
    }
    public DataService getDataService() {
        return dataService;
    }
}

//@Component // instead of using @Component can use @Named in Jakarta
@Named
//create class DataService
class DataService{

}
@Configuration
@ComponentScan // Don't have to explicitly specify. // @ComponentScan will automatically scan
public class CDIContextLauncherApplication {


    public static void main(String[] args) {

//        To prevent context from leaking use try
        try(var context = new  AnnotationConfigApplicationContext(CDIContextLauncherApplication.class))//Create a Spring Context
        {
//            If you want to see what beans are part of the Spring Context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());

        }




    }
}
