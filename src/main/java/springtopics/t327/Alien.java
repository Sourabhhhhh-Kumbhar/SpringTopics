package springtopics.t327;

public class Alien
{
    private int age;
    private Laptop lap;

    // Spring passes the values through this constructor
    public Alien(int age, Laptop lap)
    {
        this.age = age;
        this.lap = lap;
    }

    public void code()
    {
        System.out.println("Age: " + age);
        lap.compile();
    }
}