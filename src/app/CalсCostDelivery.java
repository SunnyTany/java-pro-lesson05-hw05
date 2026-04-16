package app;

import static app.Constants.DELIVERY_PRICE;

public class CalсCostDelivery extends CalcCostBase {
    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + DELIVERY_PRICE;
    }
}