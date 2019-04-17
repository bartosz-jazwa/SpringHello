package com.jazwa.zajspring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Profile("reverse")
public class ReverseEffect implements StringEffect {
    @Override
    public String apply(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
