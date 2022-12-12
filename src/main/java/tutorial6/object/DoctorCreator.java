package tutorial6.object;

import tutorial6.exception.MyCustomException;

public class DoctorCreator {
    public static Doctor createDoctor(String name) throws MyCustomException {

        if(name == null){
            throw new MyCustomException("Doctor name cannot be null");
        }

        Doctor doctor = new Doctor();
        doctor.setName(name);
        return doctor;
    }
}
