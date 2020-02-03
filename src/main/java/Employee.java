public abstract class Employee  {

protected String name;

    public boolean hasBeenPaid = false;

    private static int count = 100;

    private int empNumber;

    private int salary;

    private int income;

    protected String job;

    public int getBloodAmount() {
        return 0;
    }
    public int getHealthAmount() {
        return 0;
    }

    //default constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        //auto increment
        setEmpNumber(++count);
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isHasBeenPaid() {
        return hasBeenPaid;
    }

    // Setters
    public void setEmpNumber(int count) {
        this.empNumber = count;
    }

    public void payEmployee(){
        income =+ salary;
        hasBeenPaid = true;
        System.out.println("You paid " + name);
    }

}
