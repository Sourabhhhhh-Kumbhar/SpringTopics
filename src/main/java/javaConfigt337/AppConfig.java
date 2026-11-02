package javaConfigt337;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Laptop laptop()
    {
        return new Laptop();
    }

    //Parameter main laptop likha hai, Spring khud laptop bean daal dega
    @Bean
    public Alien alien(Laptop lap)
    {
        return new Alien(lap);
    }
}
