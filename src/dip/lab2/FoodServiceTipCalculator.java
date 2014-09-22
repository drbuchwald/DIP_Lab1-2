package dip.lab2;


public class FoodServiceTipCalculator implements CalculateTip{
    private static final String BILL_ENTRY_ERR =
            "error: The bill amount must be greater than " + minimumBillAmount;
    private double tip;

    public FoodServiceTipCalculator() {
        
    }

    @Override
    public void setTip(QualityOfService serviceQuality, double amountOfBill) {
        
        if (amountOfBill < 0.01){
            System.out.println(BILL_ENTRY_ERR);
        }
        else if (serviceQuality == null){
            throw new IllegalArgumentException (
            "error: Pease set your service quiality level");
        }
        switch(serviceQuality) {
            case GOOD:
                tip = amountOfBill * goodService;
                break;
            case FAIR:
                tip = amountOfBill * fairService;
                break;
            case POOR:
                tip = amountOfBill * poorService;
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }
    
    
}