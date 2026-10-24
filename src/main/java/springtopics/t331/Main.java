package springtopics.t331;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t331.xml");
        System.out.println("Context ready");   // no "Laptop object created" yet

        Laptop l = (Laptop) context.getBean("laptop");   // created NOW
        l.compile();
    }
}