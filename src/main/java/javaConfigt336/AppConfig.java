package javaConfigt336;

import javaConfigt336.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{

    @Bean
    @Scope("singleton")   // ek hi object
    public Alien alienSingle()
    {
        return new Alien();
    }

    @Bean
    @Scope("prototype")   // har baar naya object
    public Alien alienProto()
    {
        return new Alien();
    }
}