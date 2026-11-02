package javaConfigt337;

public class Alien
{
    private Laptop lap;

    public Alien(Laptop lap)
    {
        this.lap = lap;
    }

    public void code()
    {
        lap.compile();
    }
}
