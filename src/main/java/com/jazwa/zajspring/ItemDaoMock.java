package com.jazwa.zajspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("mock")
//@Profile("mock")
//@Primary

public class ItemDaoMock implements ItemDao {

    @Autowired
    Item snickers;

    @Override
    public Item getItemByName() {
        return snickers;
    }
}
