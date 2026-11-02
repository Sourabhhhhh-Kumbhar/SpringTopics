package javaConfigt341;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // do Computer beans hain, default yeh chunega
public class Laptop implements Computer
{
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}