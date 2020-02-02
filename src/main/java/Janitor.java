public class Janitor extends Employee {

    public String job = "Janitor";

    public Janitor(String name, int salary) {
        super(name, salary);
        super.job = this.job;
    }

    public boolean isSweeping = false;

}
