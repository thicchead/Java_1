package be.pxl.h1.oef5;

public class Spaceship {
    private String name;
    private int hits;
    private boolean shieldOn;

//    public void setShieldOn() {
//        System.out.println(name + " puts its shield on");
//        setShieldOn(true);
        // boolean waarde meegeven
//        if (shiledOn) {
//        System.out.println(name + "sets shield on");
//    }
//    this.shieldOn = shieldOn
//    }

    public void fire(Spaceship otherShip) {
        if (! otherShip.isShieldOn()) {
            otherShip.hits++;
            System.out.println(this.name + " fires at " + otherShip.name + "!");
        }
        else {
            this.hits++;
            System.out.println(otherShip.name + " has its shield on, " + this.name + " fires at its own!");
        }
    }

    public boolean isDestroyed() {
        return this.hits >= 5;
        /* if (this.hits >= 5) {
            return true;
        } else {
            return false;
        } */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean isShieldOn() {
        return shieldOn;
    }

    public void setShieldOn(boolean shieldOn) {
        if (shieldOn) {
            this.shieldOn = true;
            System.out.println(this.name + " sets its shield on!");
        } else {
            this.shieldOn = false;
        }
    }
}
