/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math1;

import java.text.DecimalFormat;

/**
 *
 * @author nider6687
 */
public class Math1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat bill = new DecimalFormat("###.00");
        //changes that amount of deimals for things to only 2
        
        double meal = 20.00;
        double tax = meal*0.13;
        double total = tax+meal;
        System.out.println("Restaurant Bill");
        System.out.println("*********");
        System.out.println(" ");
        System.out.println("Meal:      "+ bill.format(meal) + "$");
        System.out.println("Tax:       " + bill.format(tax) + "$");
        System.out.println("Total:     " + bill.format(total) + "$");
        
    }
    
}
