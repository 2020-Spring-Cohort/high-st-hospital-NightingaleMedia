public class Patient {

    private int BLOOD_LEVEL = 20;

    private int HEALTH_LEVEL = 10;

    private String patientName;

    private boolean eligibleForDischarge;

    public Patient(String name) {
        this.patientName = name;
    }

    // GETTERS
    public String getPatientName() {
        return patientName;
    }

    public int getBLOOD_LEVEL() {
        return BLOOD_LEVEL;
    }

    public boolean determineDischarge(){
        boolean answer = false;
        if ((this.HEALTH_LEVEL > 30 ) && (this.BLOOD_LEVEL > 30)){
            answer = true;
        }
        setEligibleForDischarge(answer);
        return answer;
    }

    public int getHEALTH_LEVEL() {
        return HEALTH_LEVEL;
    }

    // SETTERS
    public void setEligibleForDischarge(boolean e) {
        this.eligibleForDischarge = e;
    }

    public void setBLOOD_LEVEL(int bloodAmount){
        this.BLOOD_LEVEL += bloodAmount;
    }

    public void setHEALTH_LEVEL(int healthAmount){
        this.HEALTH_LEVEL += healthAmount;
    }

    //Methods

    public void printPatientStats(){
        System.out.println("Name         :  "+ patientName);
        System.out.println("Blood Level  :  "+ BLOOD_LEVEL);
        System.out.println("Health Level :  " + HEALTH_LEVEL);
        System.out.println("Can Discharge:  " + eligibleForDischarge);
    }
}
