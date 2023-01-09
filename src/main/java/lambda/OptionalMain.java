package lambda;

import doctor.Doctor;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Konrad", "Strzlecki");

        Optional<Doctor> optDoctor = Optional.empty();

        //optDoctor.ifPresent(doctor1 -> System.out.println(doctor1.getName()));

        String doctorNameCapital = optDoctor.map(doctor1 -> doctor1.getName().toUpperCase()).orElse("NO DOCTOR");

        System.out.println(doctorNameCapital);
    }
}
