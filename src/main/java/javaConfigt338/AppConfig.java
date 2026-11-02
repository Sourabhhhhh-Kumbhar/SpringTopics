package javaConfigt338;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig
{

    @Bean
    @Primary   // do Computer beans hain, default yeh wala
    public Computer laptop()
    {
        return new Laptop();
    }

    @Bean
    public Computer desktop()
    {
        return new Desktop();
    }

    // @Qualifier se specific bean maanga, @Primary ko ignore karke
    @Bean
    public Alien alien(@Qualifier("desktop") Computer com)
    {
        return new Alien(com);
    }
}