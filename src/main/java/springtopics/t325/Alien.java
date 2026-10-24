package springtopics.t325;

public class Alien
{
    private int age;

    // Spring calls this setter to inject the value
    public void setAge(int age)
    {
        System.out.println("Setter called");
        this.age = age;
    }
    public int getAge() { return age; }
}