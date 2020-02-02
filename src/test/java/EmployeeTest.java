import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private Hospital testHospital;

    @BeforeEach
    void setUp() {

        Doctor docUnderTest = new Doctor("david",20, "foot");
        Nurse nurseTest = new Nurse("Fred", 20000);
        Janitor janitorTest = new Janitor("Gerald",20000);
        Receptionist receptionistTest = new Receptionist("janet", 50000);

    }

//    @Test
//    public void shouldBeAbleToGetName(){
//        Employee empUnderTest = new Employee("david", 20);
//        String result = empUnderTest.getName();
//        assertEquals("david", result);
//    }
//    @Test
//    public void shouldBeAbleToGetNumber(){
//        Employee empUnderTest = new Employee("david", 20);
//        int result = empUnderTest.getEmpNumber();
//        assertEquals(101, result);
//    }
//
//    @Test
//    public void employeeNumberShouldAutoIncrement(){
//        Employee empUnderTest = new Employee("david",20);
//        Employee empUnderTest2 = new Employee("joe",20);
//        Employee empUnderTest3 = new Employee("justin",20);
//        int result = empUnderTest3.getEmpNumber();
//        assertEquals(103, result);
//    }

    @Test
    public void shouldBeAbleToMakeDoctor(){
        Doctor docUnderTest = new Doctor("david",20, "foot");
        String result = docUnderTest.getSpecialtyArea();
        assertEquals("foot", result);


    }

    @Test
    public void shouldBeAbleToMakeNurseAndAddPatients(){
        Nurse nurseTest = new Nurse("Fred", 20000);
        System.out.println(nurseTest.name);
        System.out.println("Initial Number: " + nurseTest.numberOfPatients);
        nurseTest.increasePatients();
        int newNumber = nurseTest.numberOfPatients;
        System.out.println("New Number: " + nurseTest.numberOfPatients);
        assertEquals(1,newNumber);

    }

    @Test
    public void shouldBeAbleToPayAnEmployee (){
        Nurse nurseTest = new Nurse("Fred", 20000);
        nurseTest.payEmployee();

    }


}
