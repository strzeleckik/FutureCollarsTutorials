package tutorial6;

import tutorial6.object.Doctor;
import tutorial6.object.DoctorCreator;

public class MainExceptions2 {

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.setName("Basia");

        System.out.println(doctor.getName());

        Doctor doctor1 = new Doctor();

        try {
            doctor1.setName("Konrad");

            System.out.println(doctor1.getName());
        } catch (NullPointerException e){
            System.out.println("Error while setting doctor name");
        } finally {
            System.out.println("i'll do it finally");
        }

    }

}
