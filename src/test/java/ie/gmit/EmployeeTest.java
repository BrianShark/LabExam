package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    void testCostructerName()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("B","838024502", "12345", 17);});
        assertEquals("Name provided is not valid", e.getMessage());
    }


    @Test
    void testCostructerPhone()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Brian","888888", "12345", 17);});
        assertEquals("Phone Number is not valid", e.getMessage());
    }

    @Test
    void testCostructerEmployeeNumber()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Brian","888888", "1234", 17);});
        assertEquals("Employee Number is not valid", e.getMessage());
    }

    @Test
    void testCostructerEmployeeAge()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Brian","88888888", "12345", 15);});
        assertEquals("Age must be over 16", e.getMessage());
    }

















}
