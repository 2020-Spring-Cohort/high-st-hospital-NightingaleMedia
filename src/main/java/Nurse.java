public class Nurse extends Employee implements CanTreatPatient{

    private int bloodAmount = 20;
    private int healthAmount = 15;
    private int numberOfPatients = 0;


    public Nurse(String name, int salary) {
        super(name, salary);
        super.job = "Nurse";
    }

    @Override
    public int getBloodAmount() {
        return bloodAmount;
    }

    @Override
    public int getHealthAmount() {
        return healthAmount;
    }

    public void increasePatients(){
        numberOfPatients += 1;
    }

    @Override
    public void drawBlood(int bloodAmount) {
    }

    @Override
    public void treatPatient(int amount) {
        numberOfPatients += amount;
        System.out.println("Nurse " + name +  " is now treating " + numberOfPatients + " patients.");
    }
}
