import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {
    private Hospital testHospital;
    private Patient testPatient1;
    private Patient testPatient2;

    @BeforeEach
    void setUp() {
        testHospital = new Hospital();
        Doctor docUnderTest = new Doctor("david",20, "foot");
        Nurse nurseTest = new Nurse("Fred", 20000);
        Janitor janitorTest = new Janitor("Gerald",20000);
        Receptionist receptionistTest = new Receptionist("janet", 50000);
        testPatient1 = new Patient("Jaime");
        testPatient2 = new Patient("Jackson");
        testHospital.employeeAdd(docUnderTest);
        testHospital.employeeAdd(nurseTest);
        testHospital.employeeAdd(janitorTest);
        testHospital.employeeAdd(receptionistTest);
        testHospital.patientAdd(testPatient1);
        testHospital.patientAdd(testPatient2);

    }
    @Test
    public void shouldBeAbleToGetNumberOfEmployees(){
        ArrayList<Employee> list = testHospital.getEmployees();
        int result = list.size();
        System.out.println(result);
        assertEquals(4,result);
    }

    @Test
    public void shouldBeAbleToPrintEmployees(){
        ArrayList<Employee> printList = testHospital.getEmployees();
        testHospital.printAllEmployees();
    }

    @Test
    public void shouldBeAbleToPayEmployees(){
        testHospital.printAllEmployees();
        testHospital.payAllEmployees();
        testHospital.printAllEmployees();

    }
    @Test
    public void shouldBeAbleToPrintMedicalEmployees(){
        testHospital.printMedicalEmployees();
    }

    @Test
    public void printNumberOfPatients(){
        int count = testHospital.getPatientCount();
        assertEquals(2,count);
    }




}
