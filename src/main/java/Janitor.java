public class Janitor extends Employee {

    private static String job = "Janitor";

    public Janitor(String name, int salary) {
        super(name, salary);
        super.job = this.job;
    }

    public boolean isSweeping = false;

}
