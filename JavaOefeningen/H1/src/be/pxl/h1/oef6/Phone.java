package be.pxl.h1.oef6;

public class Phone {
    private String number;
    private String provider;
    private int numberOfCalls;
    private int numberOfFreeCalls;

    public void Call(String telephoneNr) {
        if (telephoneNr.equals("112") || telephoneNr.equals("102") || telephoneNr.equals("070245245")) {
            numberOfFreeCalls++;
        } else {
            numberOfCalls++;
        }
        System.out.println("Calling " + telephoneNr);
    }
    public double getCost() {
        double totalCosts = 0;
        if (provider.equals("Floximus")) {
            totalCosts = .25 * numberOfCalls;

            if (numberOfCalls > 20) {
                totalCosts *= .95;
            }
        } else {
            totalCosts = .21 * numberOfCalls;
        }
        return totalCosts;
    }
    public void reset() {
        numberOfCalls = 0;
        numberOfFreeCalls = 0;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }

    public int getNumberOfFreeCalls() {
        return numberOfFreeCalls;
    }

    public void setNumberOfFreeCalls(int numberOfFreeCalls) {
        this.numberOfFreeCalls = numberOfFreeCalls;
    }
}
