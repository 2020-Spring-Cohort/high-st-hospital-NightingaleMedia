public class Receptionist extends Employee {



    public Receptionist(String name, int salary) {
        super(name, salary);
        super.job = "Receptionist";
    }

    public boolean isOnPhone = false;

}
