package com.jazwa.zajspring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("mysql")
//@Primary
//@Profile("mysql")
public class ItemDaoImplMysql implements ItemDao {
    @Override
    public Item getItemByName() {
        //entity manager zwracacie sql
        return null;
    }
}
