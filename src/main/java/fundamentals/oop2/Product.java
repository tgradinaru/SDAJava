package fundamentals.oop2;

/*import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;*/

import java.util.Scanner;

public class Product {
    private String productName;
    private float sellingPrice = 0f;
    private int bestBefore;

    public final static float SELLER_PRICE_VAR = 0.14f; // 14% of the original price
    public final static float BEST_BEFORE_PRICE_VAR = -0.15f; // 15% of the original price
    public final static int TIME_TO_BEST_BEFORE = 30; //30 days to Best Before
    public Scanner scanner = new Scanner(System.in);

    public Product(String productName, float sellingPrice, int bestBefore) {
        this.productName = productName;
        this.sellingPrice = sellingPrice;
        this.bestBefore = bestBefore;
    }

    public void setSellingPriceForExpiringProducts() {
        if (this.bestBefore <= TIME_TO_BEST_BEFORE && this.bestBefore > 0) {
            System.out.println(this.productName + " will expire in " + this.bestBefore + " day(s) ");
            this.sellingPrice = this.sellingPrice * (1 + BEST_BEFORE_PRICE_VAR);
            System.out.println("               Changed selling price to " + this.sellingPrice);
        }
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
        System.out.println("New name '" + this.productName + "' was set");
    }

    public void setBestBefore(int bestBefore) {
        do {
            System.out.println("Best before can't be <=0, please input a new value ");
            bestBefore = scanner.nextInt();
        }
        while (bestBefore <= 0);

        if (this.bestBefore > 0) {
            System.out.println("It's illegal to set a new expiration date for the same product! ");
            return;
        }
        this.bestBefore = bestBefore;
        System.out.println("New best before was set: " + bestBefore + " for '" + this.productName + "'");
    }

    ////////////////////////////////////////
    public void setSellingPrice(float price) {

        if ((this.sellingPrice == 0.0f && price > 0) ||
                (this.sellingPrice > 0 && price > 0 &&
                        price < this.sellingPrice * (1 + SELLER_PRICE_VAR) &&
                        price > this.sellingPrice * (1 - SELLER_PRICE_VAR))) {
            this.sellingPrice = price;
            System.out.println("The price " + this.sellingPrice + " was set for " + this.productName);
            return;
        }
        System.out.println("You can set a price between " +
                this.sellingPrice * (1 - SELLER_PRICE_VAR) + " and " + this.sellingPrice * (1 + SELLER_PRICE_VAR) +
                " for " + this.productName);
    }
    ////////////////////////////////////////


    public String getProductName() {
        return productName;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }


    public int getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                " productName='" + productName + '\'' +
                ", price= " + sellingPrice +
                ", BestBefore date= '" + bestBefore + '\'' +
                '}';
    }
}
