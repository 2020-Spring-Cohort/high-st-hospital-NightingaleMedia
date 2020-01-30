import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void shouldBeAbleToGetName(){
        Employee empUnderTest = new Employee("david",201);
        String result = empUnderTest.getName();
        assertEquals("david", result);
    }

    @Test
    public void shouldBeAbleToGetNumber(){
        Employee empUnderTest = new Employee("david",201);
        int result = empUnderTest.getEmpNumber();
        assertEquals(201, result);
    }
}
