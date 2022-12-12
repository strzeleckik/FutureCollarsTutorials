package tutorial7.seasons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class SeasonPrinterTest {

    @ParameterizedTest
    @EnumSource(value = Seasons.class, names = {"WINTER", "SUMMER"})
    void shouldPrintSeasonName(Seasons season) {
        Assertions.assertFalse(SeasonPrinter.printSeasonName(season).equals("Nie rozpoznano"));
    }
}