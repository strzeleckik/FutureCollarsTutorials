package tutorial6;

import tutorial6.exception.MyCustomException;
import tutorial6.object.Doctor;
import tutorial6.object.DoctorCreator;

public class MainCustomException {
    public static void main(String[] args) throws MyCustomException {
        Doctor doctor = DoctorCreator.createDoctor("adam");

        System.out.println(doctor.getName());
        System.out.println(Math.sqrt(16));

    }
}
