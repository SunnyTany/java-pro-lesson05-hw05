package app;

public class Main {
    public static void main(String[] args) {
        String[] data = getData();
        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));

        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);
        getOutput(product + "\n" + Constants.COST_MSG + Constants.CURRENCY + " " + baseCost + ".");

        CalсCostDelivery costDelivery = new CalсCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);
        getOutput(product + "\n" + Constants.COST_MSG + Constants.CURRENCY + " " + deliveryCost + ".");
    }

    public static String[] getData() {
        return new String[] {"abc", "5", "2.5"};
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}