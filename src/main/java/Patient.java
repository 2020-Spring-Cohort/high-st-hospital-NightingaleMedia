public class Patient {

    public int BLOOD_LEVEL = 20;

    public int HEALTH_LEVEL = 10;

    public String patientName;

    public boolean eligibleForDischarge;


    // reach goal print out string of "bad" "recovery" or "good"
    // public String patientStatus;
    public Patient(String name) {
        this.patientName = name;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getBLOOD_LEVEL() {
        return BLOOD_LEVEL;
    }

    public void setEligibleForDischarge(boolean e) {
        this.eligibleForDischarge = e;
    }

    public void setBLOOD_LEVEL(int bloodAmount){
        this.BLOOD_LEVEL += bloodAmount;
    }

    public void setHEALTH_LEVEL(int healthAmount){
        this.HEALTH_LEVEL += healthAmount;
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

    public void printPatientStats(){
        System.out.println("Name         :  "+ patientName);
        System.out.println("Blood Level  :  "+ BLOOD_LEVEL);
        System.out.println("Health Level :  " + HEALTH_LEVEL);
        System.out.println("Can Discharge:  " + eligibleForDischarge);

    }


}
