package springtopics.t330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t330.xml");
        ((Alien) context.getBean("alien")).code();   // Compiling using Desktop
    }
}
