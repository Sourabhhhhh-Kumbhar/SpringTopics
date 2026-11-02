package javaConfigt341;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien
{

    @Autowired
    private Computer com;   // Laptop aayega kyunki wo @Primary hai

    public void code()
    {
        com.compile();
    }
}