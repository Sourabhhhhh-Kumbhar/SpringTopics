package javaConfigt339;

import org.springframework.stereotype.Component;

@Component   // Spring isko khud bean bana lega
public class Laptop
{
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}
