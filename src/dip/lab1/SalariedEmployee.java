package dip.lab1;


public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

   
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    

    
}
///**
// * A simple implementation sub-class of Employee. These are low-level classes
// * in the DIP. Does it meet the rules of DIP? If not fix it.
// *
// * @author your name goes here
// */
//public class SalariedEmployee extends Employee {
//
//    /** default constructor. Is this the best way to go? */
//    public SalariedEmployee() {}
//
//    /**
//     * Convenience constructor. Is this the best way to go?
//     * @param annualSalary - the employee's annual salary
//     * @param annualBonus - a bonus benefit, if any
//     */
//    public SalariedEmployee(double annualSalary, double annualBonus) {
//        setAnnualSalary(annualSalary);
//        setAnnualBonus(annualBonus);
//    }
//
//    
//}
