/*
* Brian Sharkey - Lab Exam 2021
* Program to represent employees on and employees list with testing
* */

package ie.gmit;

public class Employee {

    public String name;
    public String number;
    public String employeeNumber;
    public int age;

    public Employee(String name,String number, String employeeNumber, int age)
    {

       Integer employeeNumberCheck = Integer.parseInt(employeeNumber);
        Integer numberCheck = Integer.parseInt(number);


        if(name.length() > 2 && name.length() < 26)
        {
            this.name = name;

        }
        else
        {
            throw new IllegalArgumentException("Name provided is not valid.");
        }



        if(employeeNumber.length() == 5 /*&& employeeNumberCheck != null*/)
        {
            this.employeeNumber = employeeNumber;

        }
        else
        {
            throw new IllegalArgumentException("Employee Number is not valid");
        }

        if(number.length() == 8 )
        {
            this.number = number;

        }
        else
        {
            throw new IllegalArgumentException("Phone Number is not valid");
        }


        if(age > 16 )
        {
            this.age = age;

        }
        else
        {
            throw new IllegalArgumentException("Age must be over 16");
        }




    }

    public Employee()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
