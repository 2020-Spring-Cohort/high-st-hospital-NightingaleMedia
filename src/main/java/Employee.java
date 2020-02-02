public abstract class Employee  {

protected String name;

    public boolean hasBeenPaid = false;

    private static int count = 100;

    private int empNumber;

    public int salary;

    public int income;

    public String job;

    public int bloodAmount;

    public int getBloodAmount() {
        return 0;
    }
    public int getHealthAmount() {
        return 0;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        //auto increment
        setEmpNumber(++count);
    }

    public String getName(){
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setEmpNumber(int count) {
        this.empNumber = count;
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

    public void payEmployee(){
        income =+ salary;
        hasBeenPaid = true;
        System.out.println("You paid " + name);
    }

}
