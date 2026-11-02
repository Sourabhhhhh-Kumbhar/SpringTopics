package javaConfigt340;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private Laptop lap;

    // 1) CONSTRUCTOR injection (recommended). Abhi yahi active hai.
    @Autowired
    public Alien(Laptop lap) {
        System.out.println("Constructor injection");
        this.lap = lap;
    }

    // 2) SETTER injection: upar wala constructor hata ke, niche wali line se // hatao
    // @Autowired
    // public void setLap(Laptop lap) {
    //     System.out.println("Setter injection");
    //     this.lap = lap;
    // }

    // 3) FIELD injection: constructor hata ke, upar "private Laptop lap;" ki jagah
    // @Autowired
    // private Laptop lap;

    public void code() {
        lap.compile();
    }
}
