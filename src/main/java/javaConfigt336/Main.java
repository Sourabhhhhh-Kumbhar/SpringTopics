package javaConfigt336;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien s1 = context.getBean("alienSingle", Alien.class);
        Alien s2 = context.getBean("alienSingle", Alien.class);
        System.out.println(s1 == s2);   // true

        Alien p1 = context.getBean("alienProto", Alien.class);
        Alien p2 = context.getBean("alienProto", Alien.class);
        System.out.println(p1 == p2);   // false
    }
}