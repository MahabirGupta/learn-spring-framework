package com.springboot.learnspringframework;

//Adding the Spring configuration

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){// record is a new feature that was introduced in JDK 16
}

record Address (String place, String city){}
@Configuration
public class HelloWorldConfiguration {

//    define the methods to create the spring beans in your configuration class
    @Bean // create the name method using the @Bean notation
    public String name(){
        return "Mahabir";
    }

    @Bean // create the name method using the @Bean notation
    public int age(){
        return 42;
    }

    @Bean
    public Person person(){
        var person = new Person("Anish",10, new Address("Kings Street","Melbourne"));
//        person.age();
//        person.name();
        return person;
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        var place = new Address("Potong Pasir","Singapore");
        return place;
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        var place = new Address("New Bridge","Sydney");
        return place;
    }
    @Bean(name = "person2")
    public Person person2(){
        var person = new Person("Anishkaa",7, address());
//        person.age();
//        person.name();
        return person;
    }

    // Using existing beans of name and age to create a person

//    1. Using method call
    @Bean
    public Person person3MethodCall(){
        var person = new Person(name(),age(),address()); // call the appropriate method of the Bean.
//        person.age();
//        person.name();
        return person;
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address3){//instead of calling the methods we are passing the parameters
        var person = new Person(name,age,address3); // call the appropriate method of the Bean.
//        person.age();
//        person.name();
        return person;
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){//instead of calling the methods we are passing the parameters
        var person = new Person(name,age,address); // call the appropriate method of the Bean.
//        person.age();
//        person.name();
        return person;
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){//instead of calling the methods we are passing the parameters
        var person = new Person(name,age,address); // call the appropriate method of the Bean.
//        person.age();
//        person.name();
        return person;
    }

}
