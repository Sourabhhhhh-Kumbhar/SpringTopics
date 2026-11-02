package javaConfigt338;

public class Alien
{
    private Computer com;

    public Alien(Computer com)
    {
        this.com = com;
    }

    public void code()
    {
        com.compile();
    }
}
