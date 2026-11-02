package javaConfigt335;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    //Default: bean ka naam = method ka naam ("alien"
    @Bean
    public Alien alien()
    {
        return new Alien();
    }

    //Custom naam = ek ya zyada naam de sakte ho
    @Bean(name = {"alien2" , "a2"})
    public Alien alienCustom()
    {
        return new Alien();
    }
}
