import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PatientTest {

    private Patient testPatient;
    private Hospital testHospital;

    @BeforeEach
    void setUp() {
        testPatient = new Patient("Ellery");
        Patient testPatient2 = new Patient("Elson");
        testHospital = new Hospital();

        testHospital.patientAdd(testPatient);
        testHospital.patientAdd(testPatient2);

    }


    @Test
    public void shouldBeAbleToGetPatientStats(){
        Patient testPatient = new Patient("Ellery");
        int result = testPatient.BLOOD_LEVEL;
        assertEquals(20,result);
    }

    @Test
    public void shouldBeAbleToPrintPatientStats(){
        testPatient.printPatientStats();
    }

    @Test
    public void shouldBeAbleToAdmitPatients(){

        int result = testHospital.getPatients().size();
        assertEquals(2,result);
    }

    @Test
    public void shouldBeAbleToPrintAllPatients(){
        testHospital.printAllPatientStats();

    }

    @Test
    public void shouldBeAbleToTreatOnePatient(){
        testPatient.printPatientStats();
        testHospital.treatPatient("Ellery", 30, 40);
        testHospital.printAllPatientStats();
    }




}



