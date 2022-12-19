package main;

import generics.Dentist;
import generics.Doctor;
import generics.Surgeon;

public class MainGenerics {
    public static void main(String[] args) {
        Doctor<Dentist> dentistDoctor = new Doctor(new Dentist());

        dentistDoctor.doDoctorStuff();

        dentistDoctor.getSpecialization().examineTeeth();

        Doctor<Surgeon> surgeonDoctor = new Doctor<>(new Surgeon());

        surgeonDoctor.doDoctorStuff();
        surgeonDoctor.getSpecialization().makeSurgery();
    }
}
