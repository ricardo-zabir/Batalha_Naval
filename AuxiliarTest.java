

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AuxiliarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuxiliarTest
{
    /**
     * Default constructor for test class AuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void A1ResultaEm00()
    {
        String eixoHorizontal="a";
        int eixoVertical=1;
        int[]c={0,0};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("a", 1));
    }

    @Test
    public void B3ResultaEm21()
    {
        String eixoHorizontal="b";
        int eixoVertical=3;
        int[]c={2,1};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("b", 3));
    }

    @Test
    public void G7ResultaEm76()
    {
        String eixoHorizontal="g";
        int eixoVertical=8;
        int[]c={7,6};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("g", 8));
    }
}





