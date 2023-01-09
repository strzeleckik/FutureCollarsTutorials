package doctor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {


    @Test
    void shouldSaveNameAndSurnameProperly(){
        Doctor doctor = new Doctor("Konrad", "Strzelecki");
        Assertions.assertAll("shouldSaveNameAndSurenameProperly",
                () -> Assertions.assertEquals("Konrad", doctor.getName()),
                () -> Assertions.assertEquals("Strzelecki", doctor.getSurname()));

    }

    @Test
    void shouldThrowException(){
        Doctor doctor = new Doctor("Konrad", "Strzelecki");
        Assertions.assertThrows(NullPointerException.class, () -> doctor.getName());
    }

}