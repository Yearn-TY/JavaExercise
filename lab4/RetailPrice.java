/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class RetailPrice {	
    public static void main(String[] args){
            String wholeSale = JOptionPane.showInputDialog(null,"Enter the item's wholesale cost.","5");
            String markupPercent = JOptionPane.showInputDialog(null,"Enter the item's markup percentage.","50");
            JOptionPane.showMessageDialog(null,"The item's retail price is $"+
                    RetailPrice.calculateRetail(Double.parseDouble(wholeSale), Double.parseDouble(markupPercent)));
    }
    public static double calculateRetail(double wholeSale, double  markupPercent){
            return wholeSale+wholeSale*markupPercent/100;
    }
}
