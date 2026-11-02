package javaConfigt339;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired   // Spring yahan Laptop daal dega
    private Laptop lap;

    public void code() {
        lap.compile();
    }
}