package springtopics.t326;

public class Alien
{
    private int age;
    private Laptop lap;   // Alien HAS-A Laptop (dependency)

    public void setAge(int age)
    {
        this.age = age;
    }
    public void setLap(Laptop lap)
    {
        this.lap = lap;
    }

    public void code()
    {
        lap.compile();   // uses the injected Laptop
    }
}