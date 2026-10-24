package springtopics.t325;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t325.xml");
        Alien a = (Alien) context.getBean("alien");
        System.out.println(a.getAge());  // 21
    }
}
