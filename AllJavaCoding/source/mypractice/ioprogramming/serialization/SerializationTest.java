package mypractice.ioprogramming.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by kingshuk on 11/12/17.
 */
public class SerializationTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Kingshuk Mukherjee");
        employee.setDOB("10/16/1986");
        employee.setOccupation("Programmer");
        employee.setSSN(683863655);

        try(OutputStream outputStream1= new FileOutputStream("/Volumes/Work/PROJECTS/Resources/Employee.ser");
            ObjectOutputStream outputStream=new ObjectOutputStream(outputStream1)){

            outputStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
