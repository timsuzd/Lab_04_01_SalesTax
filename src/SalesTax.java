public class SalesTax{
    static void main()
    {
        double purchasePrice = 23.91;
        final double SALES_TAX_RATE = .05;
        double salesTax = 0;
        double total = 0;

        salesTax = purchasePrice * SALES_TAX_RATE;
        total = purchasePrice + salesTax;

        // Java 1.8 : System.out.println
        // Modern Java 24+ IO.println
        IO.println("The sales tax on $" + purchasePrice + " is $" + salesTax);
        IO.println("The total cost is $" + total);

    }

}