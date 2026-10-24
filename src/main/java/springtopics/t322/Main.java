package springtopics.t322;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t322.xml");

        Alien a = (Alien) context.getBean("alien");  // by id
        Alien b = (Alien) context.getBean("a1");     // by alias, same object
        a.code();
        System.out.println(a == b);  // true: aliases point to the same bean
    }
}
