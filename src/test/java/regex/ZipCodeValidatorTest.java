package regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeValidatorTest {

    @Test
    void shouldBeZipValid() {
        Assertions.assertTrue(ZipCodeValidator.isZipValid("97-360"));
    }

    @Test
    void shouldBeZipNotValid() {
        Assertions.assertFalse(ZipCodeValidator.isZipValid("9a-360!"));
    }
}