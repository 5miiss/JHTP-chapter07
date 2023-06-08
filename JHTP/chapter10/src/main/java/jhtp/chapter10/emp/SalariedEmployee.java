package jhtp.chapter10.emp;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String id,double weeklySalary){
        super(firstName, lastName, id);
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary =weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary < 0.0)
        throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    @Override
    public String toString(){
        
        return super.toString() + "weekly salary is : " + weeklySalary;
    }

    @Override
    public double earnings() {

        return getWeeklySalary();
    }
    
}
