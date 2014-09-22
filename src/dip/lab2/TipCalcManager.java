/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Dan
 */
public class TipCalcManager {
    
     private TipCalcManager tip;
    
    public TipCalcManager(TipCalcManager tip){
        this.tip = tip;
    }
    
    public double getFoodTip(QualityOfService serviceQuality, double billAmount){
        
        tip.setTip(serviceQuality, billAmount);
        return tip.getTip();
    }
    
    public double getBaggageTip(QualityOfService serviceQuality, double numberOfBags){
        
        tip.setTip(serviceQuality, numberOfBags);
        return tip.getTip();
    }

   
    }
    


