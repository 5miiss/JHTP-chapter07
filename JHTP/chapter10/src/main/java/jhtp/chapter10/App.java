package jhtp.chapter10;

import java.lang.reflect.Field;

import jhtp.chapter10.emp.BasePlusCommissionEmployee;
import jhtp.chapter10.emp.CommissionEmployee;
import jhtp.chapter10.emp.Employee;
import jhtp.chapter10.emp.HourlyEmployee;
import jhtp.chapter10.emp.SalariedEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // create subclass objects
        SalariedEmployee salariedEmployee =
        new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee =
        new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
        new CommissionEmployee(
        "Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
        new BasePlusCommissionEmployee(
        "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Employees processed individually:");


            System.out.printf("%n%s%n%s: $%,.2f%n%n",

            salariedEmployee, "earned", salariedEmployee.earnings());

            System.out.printf("%s%n%s: $%,.2f%n%n",

            hourlyEmployee, "earned", hourlyEmployee.earnings());

            System.out.printf("%s%n%s: $%,.2f%n%n",

            commissionEmployee, "earned", commissionEmployee.earnings());

            System.out.printf("%s%n%s: $%,.2f%n%n",

            basePlusCommissionEmployee,

            "earned", basePlusCommissionEmployee.earnings());

            Employee[] employees = new Employee[4];
            // initialize array with Employees
            employees[0] = salariedEmployee;
            employees[1] = hourlyEmployee;
            employees[2] = commissionEmployee;
            employees[3] = basePlusCommissionEmployee;
            System.out.printf("Employees processed polymorphically:%n%n");
            for (Employee employee : employees) {
                System.out.println(employee);
                if(employee instanceof BasePlusCommissionEmployee){
                    BasePlusCommissionEmployee emp = (BasePlusCommissionEmployee)employee;
                    emp.setBaseSalary(1.10 * emp.getBaseSalary());
                    System.out.printf(

                    "new base salary with 10%% increase is: $%,.2f%n",

                    emp.getBaseSalary());

                    } // end i
                    System.out.printf("earned $%,.2f%n%n",employee.earnings());
                }

                for (int j = 0; j < employees.length; j++){
                    System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getSimpleName());
                    Field[] fields =  employees[j].getClass().getDeclaredFields();
                     for (Field field : fields) {
                        System.out.println(field.getName());

                     }
                }

            }
    }

