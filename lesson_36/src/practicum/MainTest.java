package practicum;

import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main m;
    @BeforeEach
    public void setUp(){
        m = new Main();
    }


    public void getAddressesTestEmpty(){
        assertEquals(Arrays.asList(), m.getAddresses(Arrays.asList()));
    }
}