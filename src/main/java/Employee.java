public class Employee  {

protected String name;

    public int getEmpNumber() {
        return empNumber;
    }

    protected int empNumber;

    public Employee(String name, int number) {
        this.name = name;
        this.empNumber = number;
    }

    public String getName(){
        return name;
    }
}
