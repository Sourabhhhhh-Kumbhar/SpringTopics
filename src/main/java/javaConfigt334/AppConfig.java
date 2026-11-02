package javaConfigt334;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      //Batata Hai ki ye class spring ki config hai xml ki jagah
public class AppConfig
{
    @Bean       //Is method ka return object Spring ka bean ban jata hai
    public Alien alien()        //Method ka naam hi bean ka naam (id) hota hai
    {
        return new Alien();
    }
}

