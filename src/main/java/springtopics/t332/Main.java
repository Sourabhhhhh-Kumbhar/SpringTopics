package springtopics.t332;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("t332.xml");

// By type: no id needed and no casting
        Alien a = context.getBean(Alien.class);
        a.code();

// By id + type: safer when there are multiple beans of the same type
        Alien b = context.getBean("alien", Alien.class);
    }
}
