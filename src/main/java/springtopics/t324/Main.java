package springtopics.t324;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t324.xml");

        Alien s1 = (Alien) context.getBean("alienSingleton");
        Alien s2 = (Alien) context.getBean("alienSingleton");
        System.out.println(s1 == s2);  // true: same object

        Alien p1 = (Alien) context.getBean("alienPrototype");
        Alien p2 = (Alien) context.getBean("alienPrototype");
        System.out.println(p1 == p2);  // false: different objects
    }
}
