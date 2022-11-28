package be.pxl.h1.opdracht13;

public class SalesPersonApp {
    public static void main(String[] args) {
        SalesPerson salesPerson = new SalesPerson();

        salesPerson.setMonthlySales(1, 500);
        salesPerson.setMonthlySales(5, 1000);
        salesPerson.setMonthlySales(10, 800);
        salesPerson.setMonthlySales(12, 700);

        System.out.println("Total sales: " + salesPerson.getTotalSale());
        System.out.println("Average sales: " + salesPerson.getAverageSale());
        // salesPerson.getMonthlySales();

    }
}
