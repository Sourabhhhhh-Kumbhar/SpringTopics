package springtopics.t321;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        // Loads the XML and creates the Spring container (IoC container)
        ApplicationContext context = new ClassPathXmlApplicationContext("t321.xml");

        // Ask the container for the bean by its id. We never write "new Alien()"
        Alien alien = (Alien) context.getBean("alien");
        alien.code();
    }
}