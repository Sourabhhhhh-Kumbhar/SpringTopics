package springtopics.t328;

public class Alien
{
    private Computer com;   // depends on the INTERFACE, not a specific class

    public void setCom(Computer com)
    {
        this.com = com;
    }

    public void code()
    {
        com.compile();
    }
}