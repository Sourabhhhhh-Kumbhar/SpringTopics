package javaConfigt342;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")   // har getBean() pe naya Alien
public class Alien {

    @Value("21")   // seedhi value inject (primitives aur String ke liye)
    private int age;

    public void code() {
        System.out.println("Age: " + age);
    }
}