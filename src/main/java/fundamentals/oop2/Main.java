package fundamentals.oop2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Implement all the classes with methods and fields necessary for the following scenario:
 * A store has to sell multiple products:
 * A product is defined by: name, price, expiration date.
 * The price of the product can be change but only with a difference of max 14% of the original price.
 * The store can inform the seller with the following informations if he asks for them:
 * which is the list of products with price bigger than a specified price
 * which is the list of products that have a the expiration date the next day
 * the expiration date of the product with a certain name
 * all the names of the products that have already expired
 * The seller can also:
 * modify the price of all the products from the store that have 30 days until the expiration date by
 * reducing the price with 15%
 * rename  a specific product that has a certain name, from the list
 */

public class Main {

    public static void main(String[] args) {

        Product produs1 = new Product("OLIVE_OIL_1L", 40f, 500);
        Product produs2 = new Product("SPARKLING_WATER_2L", 2.5f, 1);
        Product produs3 = new Product("CHEESE_300GR", 10.5f, 31);
        Product produs4 = new Product("BREAD_350GR", 1.5f, 32);
        Product produs5 = new Product("YOGURT_100ML", 0.8f, 2);
        Product produs6 = new Product("COCA_2L", 6.5f, -2);
        Product produs7 = new Product("PEPSI_500ML", 3f, -1);
        Product produs8 = new Product("CROISSANT", 1.2f, 1);


        Product[] arrayOfProducts = new Product[8];
        arrayOfProducts[0] = produs1;
        arrayOfProducts[1] = produs2;
        arrayOfProducts[2] = produs3;
        arrayOfProducts[3] = produs4;
        arrayOfProducts[4] = produs5;
        arrayOfProducts[5] = produs6;
        arrayOfProducts[6] = produs7;
        arrayOfProducts[7] = produs8;

        //checkProductsWithPriceBiggerThan(arrayOfProducts, 20f);
        //checkProductsWithThatExpireTomorrow(arrayOfProducts);
        //checkExpiredProducts(arrayOfProducts);
        //renameProductFromList(arrayOfProducts);
        changePricesForExpiringProducts(arrayOfProducts);

    }

    private static void checkProductsWithPriceBiggerThan(Product[] arrayOfProducts, float limitPrice) {
        for (Product element : arrayOfProducts) {
            if (element.getSellingPrice() > limitPrice) {
                System.out.println(element + " has price bigger than  " + limitPrice);
            }
        }
        System.out.println("-------------------------");
    }

    private static void checkProductsWithThatExpireTomorrow(Product[] arrayOfProducts) {
        for (Product element : arrayOfProducts) {
            if (element.getBestBefore() == 1) {
                System.out.println(element + " expires tomorrow!");
            }
        }
        System.out.println("-------------------------");
    }

    private static void checkExpiredProducts(Product[] arrayOfProducts) {
        for (Product element : arrayOfProducts) {
            if (element.getBestBefore() < 0) {
                System.out.println(element + " expired " + element.getBestBefore() * (-1) + " day(s) ago");
            }
        }
        System.out.println("-------------------------");
    }

    private static void changePricesForExpiringProducts(Product[] arrayOfProducts) {
        for (Product element : arrayOfProducts) {
            element.setSellingPriceForExpiringProducts();
        }
        System.out.println("-------------------------");
    }

    private static void renameProductFromList(Product[] arrayOfProducts) {
        if (arrayOfProducts.length < 1) {
            System.out.println("We didn't found any products in list");
            return;
        }
        System.out.println("Here is the list of products");
        for (Product element : arrayOfProducts) {
            System.out.println(element);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose one product for renaming, typing his name:");
        String testNameFromUser = scanner.next();
        for (int i = 0; i < arrayOfProducts.length; i++) {
            if (arrayOfProducts[i].getProductName().contentEquals(testNameFromUser)) {
                System.out.println("Type the product's '" + arrayOfProducts[i].getProductName() + "' new name");
                String newNameFromUser = scanner.next();
                //from here we test if the same name, like the newNameFromUser is in the list
                /*if (i != arrayOfProducts.length - 1) {
                    for (int j = 0; j < arrayOfProducts.length - 2; j++) {
                        if (j == i) {
                            j++;
                        }
                        if (arrayOfProducts[j].getProductName().contentEquals(newNameFromUser)) {
                            System.out.println("we found " + arrayOfProducts[j].getProductName()
                                    + "with the same name");
                            System.out.println("Please insert a new name");
                            testNameFromUser = scanner.next();
                         }
                    }
                } else{
                    for (int j = 0; j < arrayOfProducts.length - 2; j++) {
                        if (j == i) {
                            j++;
                        }
                        if (arrayOfProducts[j].getProductName().contentEquals(newNameFromUser)) {
                            System.out.println("we found " + arrayOfProducts[j].getProductName()
                                    + "with the same name");
                            System.out.println("Please insert a new name");
                            testNameFromUser = scanner.next();
                        }
                    }

                }*/
                arrayOfProducts[i].setProductName(newNameFromUser);
                System.out.println("We have the new '" + newNameFromUser + "' name for: " + testNameFromUser);
            }
        }
        System.out.println("Here is the new list of products");
        for (Product element : arrayOfProducts) {
            System.out.println(element);
        }
        System.out.println("-------------------------");
    }
}
