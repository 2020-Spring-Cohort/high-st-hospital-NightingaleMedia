import java.util.Scanner;

public class HospitalApplication {
    private static Hospital hospital = new Hospital();
    private static Patient patient1 = new Patient("Ellery");
    private static Patient patient2 = new Patient("Joseph");
    private static Employee doc1 = new Doctor("House",90000, "Radiology");
    private static Employee doc2 = new Doctor("Delos",80000, "Cardiology");
    private static Employee nurse1 = new Nurse("Tisdale", 50000);
    private static Employee nurse2 = new Nurse("Ratched", 50000);
    private static Employee janitor1 = new Janitor("Gerald",40000);
    private static Employee reception1 = new Receptionist("Janet", 45000);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        initialize(hospital);

    //Welcome to the hospital, here are all the employees
        System.out.println("Welcome to High Street Hospital");
        int menuChoice = 0;

        while (menuChoice==0){
            System.out.println("Main Menu -- 9 for options");
            int hospitalChoice = input.nextInt();
            switch (hospitalChoice){
                case 0:
                    menuChoice = 1;
                    System.out.println("Thanks for playing!");
                    break;
                case 1:
                    input.nextLine();
                    hospital.printAllEmployees();
                    menuChoice=0;
                    break;
                case 2:
                    input.nextLine();
                    printAllPatients();
                    break;
                case 3:
                    input.nextLine();
                    hospital.printMedicalEmployees();
                    break;
                case 4:
                    input.nextLine();
                    treatPatient();
                    break;
                case 5:
                    input.nextLine();
                    dischargePatient();
                    break;
                case 6:
                    input.nextLine();
                    hospital.payAllEmployees();
                    break;
                case 7:
                    input.nextLine();
                    //addEmployee();
                    break;

                case 9:
                    printMenuOptions();
            }
        }
    }

    public static void printMenuOptions(){
        System.out.println("1: Print All Employees");
        System.out.println("2: Print All Patients");
        System.out.println("3: Print Medical Staff Only");
        System.out.println("4: Treat a Patient");
        System.out.println("5: Discharge a Patient");
        System.out.println("6: Pay Staff ");
        System.out.println("0: EXIT");
    }
    public static void initialize(Hospital hospital){
        hospital.patientAdd(patient1);
        hospital.patientAdd(patient2);
        hospital.employeeAdd(doc1);
        hospital.employeeAdd(doc2);
        hospital.employeeAdd(nurse1);
        hospital.employeeAdd(nurse2);
        hospital.employeeAdd(janitor1);
        hospital.employeeAdd(reception1);
    }

    public static void printAllPatients(){
        System.out.println("We have: " + hospital.getPatientCount() + " patient(s): ");
        hospital.printAllPatientStats();
    }

    public static void treatPatient() {
        System.out.println("Which patient do you want to treat? (Select by typing name)");
        hospital.printAllPatientStats();
        String patientChoice = input.nextLine();
        System.out.println("You chose: " + patientChoice);


        boolean pickEmployee = false;

       // input.nextLine();


        while (pickEmployee == false) {
            System.out.println("Who should treat them? (Pick by Employee Number) ");
            hospital.printAllEmployees();
            int choice = input.nextInt();
            input.nextLine();
            //treatPatient returns a boolean

            pickEmployee = hospital.treatPatient(choice,patientChoice);

        }
    }

    public static void dischargePatient(){
        System.out.println("Pick the patient to discharge. (type the name)");
        printAllPatients();
        String choice = input.nextLine();
        hospital.dischargePatient(choice);
    }


}
