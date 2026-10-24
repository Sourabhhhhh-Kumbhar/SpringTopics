package springtopics.t330;

import springtopics.t329.Computer;

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