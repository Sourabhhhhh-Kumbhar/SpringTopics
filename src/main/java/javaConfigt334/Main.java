package javaConfigt334;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        //Xml ki jagah config class dete hai
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien a = context.getBean(Alien.class);
        a.code();       //Coding....
    }
}
