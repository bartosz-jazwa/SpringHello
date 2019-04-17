package com.jazwa.zajspring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("upper")
public class UpperEffect implements StringEffect {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
