package fundamentals.oop2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String productName;
    private float sellingPrice;
    private Date bestBefore;

    public final static float SELLER_PRICE_VAR = 0.14f; // 14% of the original price
    public final static float BEST_BEFORE_PRICE_VAR = -0.15f; // 14% of the original price
    public final static long TIME_TO_BEST_BEFORE = 1000L * 60 * 60 * 24 * 30; //30 days to Best Before

    public Product(String productName, float sellingPrice, String args[]) { // Product first constructor
        this.productName = productName;
        this.sellingPrice = 0;

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String input = args.length == 0 ? "28-02-2021" : args[0];
        try {
            this.bestBefore = ft.parse(input);
            System.out.println(this.bestBefore);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
        System.out.println("New name '" + this.productName + "' was set");
    }


    public void changeSellingPrice(float price) {
        if (price <= 0 || this.sellingPrice * (1 + SELLER_PRICE_VAR) < price
                || price < this.sellingPrice * (1 - SELLER_PRICE_VAR)) {
            System.out.println("You can set a price only between" +
                    this.sellingPrice * (1 - SELLER_PRICE_VAR) + " and " + this.sellingPrice * (1 + SELLER_PRICE_VAR));
            return;
        }
        this.sellingPrice = price;
        System.out.println("Successfully set up the new price " + price);
    }

    public void setBestBeforePriceVar(Date today) {
        today.getTime();
        long todayInMilliSec;
        long bestBeforeInMilliSec;
        today.setTime(todayInMilliSec);
        this.bestBefore.setTime(bestBeforeInMilliSec);

        if (bestBeforeInMilliSec - TIME_TO_BEST_BEFORE <= todayInMilliSec) {
            this.sellingPrice -= this.sellingPrice * BEST_BEFORE_PRICE_VAR;
        }
    }

    public String toString() {
        return "Product{" +
                " productName='" + productName + '\'' +
                ", price=" + sellingPrice +
                ", BB='" + bestBefore + '\'' +
                '}';
    }
}
