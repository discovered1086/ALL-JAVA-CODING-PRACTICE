package mypractice.ioprogramming.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by kingshuk on 11/12/17.
 */
public class DeserializationTest {

    public static void main(String[] args) {
        Employee employee;

        try(FileInputStream fileInputStream=new FileInputStream("/Volumes/Work/PROJECTS/Resources/Employee.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){

            employee=(Employee)objectInputStream.readObject();

            System.out.println(employee.toString());
        }catch(IOException io){
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
