package dip.lab2;

public class BaggageServiceTipCalculator implements CalculateTip{

    private static final double maximumBillAmount = 100.00;
    private static final String BILL_ENTRY_ERR =
            "error: Your bill must be between " + minimumBillAmount + " and "
            + maximumBillAmount;
    
    private double minTipPerBag = 1.00;
    private double tip;

    public BaggageServiceTipCalculator() {
        
    }

    @Override
    public void setTip(QualityOfService serviceQuality, double numberOfBags) {
        if (numberOfBags <= 0){
            throw new IllegalArgumentException (
            "error: back count must be more than zero");
        }
        else if ((numberOfBags * minTipPerBag) > maximumBillAmount || (numberOfBags * minTipPerBag) < minimumBillAmount ){
            System.out.println(BILL_ENTRY_ERR);
        }
        if (serviceQuality == null){
            throw new IllegalArgumentException (
            "error: Service Quality measure must be set");
        }
        
        switch(serviceQuality) {
            case GOOD:
                tip = minTipPerBag * numberOfBags * (1 + goodService);
                break;
            case FAIR:
                tip = minTipPerBag * numberOfBags * (1 + fairService);
                break;
            case POOR:
                tip = minTipPerBag * numberOfBags * (1 + poorService);
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }
    
       
    public double getminTipPerBag() {
        return minTipPerBag;
    }

    public void setminTipPerBag(double minTipPerBag) {
        if(minTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.minTipPerBag = minTipPerBag;
    }

    public double getMinTipPerBag() {
        return minTipPerBag;
    }

    public void setMinTipPerBag(double minTipPerBag) {
        this.minTipPerBag = minTipPerBag;
    }
    
    
}