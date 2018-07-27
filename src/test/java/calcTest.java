import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calcTest {
    private calc c;
    @Before
    public void initTest() {
        c = new calc();
    }

    @After
    public void afterTest() {
        c = null;
    }
    @Test
    public void sum() {
        assertEquals(5.0, c.sum(2, 3), 2);
    }

    @Test
    public void minus() {
        assertEquals(-1.0, c.minus(2, 3), 2);
    }

    @Test
    public void multiply() {
        assertEquals(6.0, c.multiply(2,3), 2);
    }

    @Test
    public void divide() {
        assertEquals(5.0, c.divide(3,1), 0.1);
    }
}