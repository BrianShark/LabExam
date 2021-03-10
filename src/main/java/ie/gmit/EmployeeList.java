package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList extends Employee {
    List<Employee> employees = new ArrayList<Employee>();

    public EmployeeList()
    {

    }

   public void addEmployee(Employee employee)
   {
       for(Employee e : employees) {
           if(e.employeeNumber.equals(employee.employeeNumber))
           {
               throw new IllegalArgumentException("Employee Number already exists");
           }
           else
           {
               employees.add(employee);
           }
       }
   }

   public int getListSize()
   {
       int size = employees.size();
       return size;
   }





}
