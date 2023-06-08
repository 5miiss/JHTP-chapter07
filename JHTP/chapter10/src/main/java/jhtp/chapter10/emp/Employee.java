package jhtp.chapter10.emp;

public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String id;

    public Employee(String firstName, String lastName, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double earnings();
    @Override
    public String toString(){
        return String.format("the employee first name is  %s and last name is %s and id is %s ", this.firstName, this.lastName, this.id);
    }
}
