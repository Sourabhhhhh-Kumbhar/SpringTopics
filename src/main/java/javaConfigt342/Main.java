package javaConfigt342;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien a1 = context.getBean(Alien.class);
        Alien a2 = context.getBean(Alien.class);
        a1.code();                        // Age: 21
        System.out.println(a1 == a2);     // false, prototype hai
    }
}
