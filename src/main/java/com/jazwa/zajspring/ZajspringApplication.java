package com.jazwa.zajspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ZajspringApplication implements CommandLineRunner {

    @Autowired
    String applicationName;
    @Autowired
    Double version;
    @Autowired
    Store store;
    @Autowired
            @Qualifier("mysql")
    ItemDao itemDao;
    @Autowired
    ArrayList<String> stringList;
    @Autowired
    StringEffect stringEffect;

    public static void main(String[] args) {
        SpringApplication.run(ZajspringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*System.out.println("Hello world");

        System.out.println(applicationName);

        store.getItems().forEach(item -> System.out.println(item));*/

        /*Item item = itemDao.getItemByName();
        System.out.println(item);*/

        //zadanie 1
        stringList.forEach(System.out::println);
        //zadanie 2

        //zadanie 3
        String s = "AsDf";
        System.out.println(stringEffect.apply(s));

    }
}
