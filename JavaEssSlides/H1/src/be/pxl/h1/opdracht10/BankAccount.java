package be.pxl.h1.opdracht10;

public class BankAccount {
    private String name;
    private String code;
    private int controlDigits;
    private long number;
    private double amount;

    public String getAccount(){
        return code + controlDigits + number;
    }

    public boolean isValid() {
        return 98 - (number * 1000000 + 111400) % 97 == controlDigits;
    }

    public void withdraw(double amount){
        if (amount >= this.amount) {
            System.out.println("Er staat niet genoeg op de rekening");
        } else {
            this.amount -= amount;
        }
    }

    /*Mogelijk om een boolean isEmpty te programmeren, maar leek me onnuttig
    * Enigste wat die doet is > 0 vervangen, hoeft niet om een methode te programmeren dan
    * Lector heeft het wel zo*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getControlDigits() {
        return controlDigits;
    }

    public void setControlDigits(int controlDigits) {
        this.controlDigits = controlDigits;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
