package tutorial7;

import org.junit.jupiter.api.*;

public class TestLifecycleTest {


    @BeforeAll
    public static void beforeAllFunction(){
        System.out.println("called before all test");
    }

    @BeforeEach
    public void beforeEachFunction(){
        System.out.println("called before each test");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("called after each test");
    }

    @Test
    void shouldDoSthWhenSth(){
        System.out.println("shouldDoSthWhenSth");
        int expectedValue = 0;
        int actualValue = 0;
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldDoSthWhenSthElse(){
        System.out.println("shouldDoSthWhenSthElse");
        int expectedValue = 1;
        int actualValue = 1;
        Assertions.assertEquals(expectedValue, actualValue);
    }

}
