package jhtp.chapter10.emp;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String id, double grossSales,double commissionRate,double baseSalary) {
        super(firstName, lastName, id,grossSales,commissionRate);
        if (baseSalary < 0.0) // validate baseSalary
        
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        
        this.baseSalary = baseSalary;    
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

        // calculate earnings; override method earnings in CommissionEmployee
        @Override
        public double earnings()
        {
            return getBaseSalary() + super.earnings();
        }
    
        // return String representation of BasePlusCommissionEmployee object
        @Override
        public String toString()
        {
            return String.format("%s %s; %s: $%,.2f",
            "base-salaried", super.toString(),
            "base salary", getBaseSalary());
        }
}
