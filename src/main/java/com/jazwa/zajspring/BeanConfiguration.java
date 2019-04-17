package com.jazwa.zajspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfiguration  {

    @Bean
    String applicationName(){
        return "moja aplikacja";
    }
    @Bean
    Double version(){
        return 4.01;
    }

    @Bean
    Item snickers(){
        Item item = new Item();
        item.setName("Snickers");
        item.setPrice(11);
        item.setDesc("czekoladowy");

        return item;
    }
    @Bean
    Item cola(){
        Item item = new Item();
        item.setName("cola");
        item.setPrice(2);
        item.setDesc("gazowana");

        return item;
    }

    @Bean
    Store store(){
        Store store = new Store();
        List<Item> items = new ArrayList<>();
        items.add(snickers());
        items.add(cola());
        store.setItems(items);

        return store;
    }

    @Bean
    ArrayList<String> stringList(){
        ArrayList<String> list = new ArrayList<>();
        String s;
        for (int i = 0; i <10; i++) {
            s = "text"+i;
            list.add(s);
        }
        return list;
    }
}
