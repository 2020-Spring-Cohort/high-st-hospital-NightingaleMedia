import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

    HashMap<String, Employee> HospitalEmployees = new HashMap <String, Employee>();
    HashMap<String, Patient> HospitalPatients = new HashMap<>();

    public int patientCount = getPatientCount();

    public int getPatientCount(){
        int count = 0;
        for(Patient patient: HospitalPatients.values()){
            count++;
        } return count;
    }

    public void employeeAdd(Employee employee){
        HospitalEmployees.put(employee.getName(), employee);
    }

    public void patientAdd(Patient patient){
        HospitalPatients.put(patient.getPatientName(), patient);
    }

    public ArrayList<Employee> getEmployees(){
        return new ArrayList<>(HospitalEmployees.values());
    }

    public ArrayList<Patient> getPatients(){
        return new ArrayList<>(HospitalPatients.values());
    }

    public void payAllEmployees(){
        for (Employee name : HospitalEmployees.values()){
            System.out.println(name.getJob() + " " + name.getName() + " got paid: $" + name.salary);
            name.hasBeenPaid = true;
        }
    }

    public void printAllEmployees(){
        String leftAlignFormat = "| %-7s | %-14s |  %-7d |  %8d | %6b |%n";

        System.out.format("+---------+--------- ALL STAFF -------+-----------+--------+%n");
        System.out.format("|  Name   | Job            |  Emp #   | Salary    | Paid?  |%n");
        System.out.format("+---------+----------------+----------+-----------+--------|%n");
        for (Employee name : HospitalEmployees.values()){
            System.out.printf(leftAlignFormat, name.getName(),
                    name.getJob(),
                    name.getEmpNumber(),
                    name.salary,
                    name.hasBeenPaid);
        }
        System.out.format("+---------+----------------+----------+-----------+--------+%n");
    }
    public void printMedicalEmployees() {
        String leftAlignFormat = "| %-7s | %-14s | %9d | %6b |%n";
        System.out.format("+---------+------ MEDICAL STAFF -------+--------+%n");
        System.out.format("|  Name   | Job            | Salary    | Paid?  |%n");
        System.out.format("+---------+----------------+-----------+--------+%n");
        for (Employee name : HospitalEmployees.values()) {
            if (name instanceof CanTreatPatient) {
                System.out.printf(leftAlignFormat, name.getName(),
                        name.getJob(),
                        name.salary,
                        name.hasBeenPaid);
            }

        }
        System.out.format("+---------+----------------+-----------+--------+%n");
    }

    public void printAllPatientStats(){
        String leftAlignFormat = "| %-7s | %-14d | %9d | %10b |%n";

        System.out.format("+---------+------ PATIENT STATS -------+------------+%n");
        System.out.format("|  Name   | Blood Level    | Health    | Discharge? |%n");
        System.out.format("+---------+----------------+-----------+------------+%n");
        for (Patient patientPrint: HospitalPatients.values()){
        System.out.printf(leftAlignFormat, patientPrint.patientName,
                patientPrint.BLOOD_LEVEL,
                patientPrint.HEALTH_LEVEL,
                patientPrint.eligibleForDischarge);

        }
        System.out.format("+---------+----------------+-----------+------------+%n");
    }

    public void treatPatient(Employee type, String patientName) {

        if (type instanceof CanTreatPatient){
            Patient patient = HospitalPatients.get(patientName);
            patient.setBLOOD_LEVEL(type.getBloodAmount());
            patient.setHEALTH_LEVEL(type.getHealthAmount());
            System.out.println(type.getJob() + " " + type.getName() + " treated " + patient.getPatientName());
            System.out.println("Blood Treatment Amount: " + type.getBloodAmount());
            System.out.println("Health Treatment Amount: " + type.getHealthAmount());
            patient.determineDischarge();
            if (patient.eligibleForDischarge == true){
                System.out.println("This patient is now eligble for discharge.");
            }
        } else {
            System.out.println("This employee is not authorized...");
        }
    }

    public void dischargePatient(String patientName){
        Patient patient = HospitalPatients.get(patientName);
        if(patient.eligibleForDischarge == true) {
            System.out.println(patientName + " has been discharged.");
            HospitalPatients.remove(patientName);
        } else {
            System.out.println("The patient needs more treatment before discharge.");
        }
    }





}
