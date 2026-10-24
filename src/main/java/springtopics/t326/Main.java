package springtopics.t326;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t326.xml");
        Alien a = (Alien) context.getBean("alien");
        a.code();   // Compiling using Laptop
    }
}
