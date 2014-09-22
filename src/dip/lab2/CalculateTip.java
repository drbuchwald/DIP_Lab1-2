/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *abstract layer of the DIP
 * 
 * 
 * @author Dan
 */
public interface CalculateTip {
    /**
     * public static final properties
     */
    
    public static final double minimumBillAmount = 0.00;
    public static final double poorService = 0.00;
    public static final double fairService = 0.00;
    public static final double goodService = 0.00;
    
    /**
     * 
     * 
     * 
     */
    public abstract void setTip(QualityOfService serviceQuality, double billOrBagCount);
    public abstract double getTip();
    
    
}
