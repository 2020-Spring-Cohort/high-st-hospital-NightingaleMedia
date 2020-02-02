public class Nurse extends Employee implements CanTreatPatient{

    public int bloodAmount = 20;
    public int healthAmount = 15;

    public Nurse(String name, int salary) {
        super(name, salary);
        super.job = "Nurse";
    }

    int numberOfPatients = 0;

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
        System.out.println("Treament success");
    }
}
