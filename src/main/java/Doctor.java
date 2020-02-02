public class Doctor extends Employee implements CanTreatPatient {


    public String specialtyArea;
    public int bloodAmount = 30;
    public int healthAmount = 25;

    public Doctor(String name, int salary, String specialtyArea) {
        super(name, salary);
        super.job = "Doctor";
        this.specialtyArea = specialtyArea;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }

    @Override
    public int getBloodAmount() {
        return bloodAmount;
    }

    @Override
    public int getHealthAmount() {
        return healthAmount;
    }

    @Override
    public void drawBlood (int amount){
        return;
    }

    @Override
    public void treatPatient(int amount) {

    }
}
