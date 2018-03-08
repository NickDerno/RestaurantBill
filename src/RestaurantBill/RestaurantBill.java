/*
 * Nick Dernovsek
 * restaurantbill.java
 * This program will calcuate the price of a restaurant bill
 */

package RestaurantBill;

import java.text.DecimalFormat;

/**
 *
 * @author nider6687
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat bill = new DecimalFormat("###.00");
        //changes that amount of deimals for things to only 2
        
        double meal = 20.00;
        double tax = meal*0.13;
        //calculates the tax
        
        double total = tax+meal;
        //calculates the total
        
        System.out.println("Restaurant Bill");
        System.out.println("*********");
        System.out.println(" ");
        System.out.println("Meal:      "+ bill.format(meal) + "$");
        System.out.println("Tax:       " + bill.format(tax) + "$");
        System.out.println("Total:     " + bill.format(total) + "$");
        
    }
    
}
