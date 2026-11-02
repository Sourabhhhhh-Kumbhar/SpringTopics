package javaConfigt335;

import javaConfigt334.Alien;
import javaConfigt334.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        //Xml ki jagah config class dete hai
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien a = (Alien) context.getBean("alien2");          // custom naam se
        Alien b = context.getBean("alienCustom", Alien.class); // ye ab NAHI chalega, kyunki naam badal gaya
    }
}
