package springtopics.t323;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Before creating context");
        ApplicationContext context = new ClassPathXmlApplicationContext("t323.xml");
        System.out.println("After creating context");  // constructor message appears BEFORE this

// No new object here, because Spring already created it at startup
        Alien a = (Alien) context.getBean("alien");
        a.code();
    }
}
