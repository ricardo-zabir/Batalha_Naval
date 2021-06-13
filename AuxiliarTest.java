//A classe de testes realiza a testagem na transição entre os eixos clássicos do jogo de batalha naval para seu posicionamento adequado
//no plano vetorial. Ex.:(A 1 >> 0,0)

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
        String vert="a";
        int horz=1;
        int[]c={0,0};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("a", 1));
    }

    @Test
    public void B3ResultaEm12()
    {
        String vert="b";
        int horz=3;
        int[]c={1,2};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("b", 3));
    }

    @Test
    public void G7ResultaEm76()
    {
        String vert="g";
        int horz=7;
        int[]c={7,6};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("g", 7));
    }
}





