package be.pxl.h1.opdracht13;

public class SalesPerson {
    private String name;
    private double[] monthlySales = new double[12];

    public void setMonthlySales(int month, double amount) {
        monthlySales[month - 1] = amount;
    } // -1 niet vergeten

    public double getTotalSale() {
        double totalSale = 0;

        for (double sale : monthlySales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public double getAverageSale() {
        return getTotalSale() / monthlySales.length;
    }

    /* public void getMonthlySales() {
        for (double sale : monthlySales) {
            System.out.println(sale);
        }
    } */

}
