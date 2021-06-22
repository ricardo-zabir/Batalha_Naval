

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste AuxiliarTest que realiza a automação do método ajusteDaCoordenada
 *
 * @author Ricardo Fonseca Zabir  (ricardofonseca.zabir@hotmail.com)
 * @version 2021-06-21
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
    public void G8ResultaEm76()
    {
        String eixoHorizontal="g";
        int eixoVertical=8;
        int[]c={7,6};
        assertArrayEquals(c, Auxiliar.ajusteDaCoordenada("g", 8));
    }
    
    @Test
    public void J10ResultaEm99()
    {
        String eixoHorizontal="j";
        int eixoVertical=10;
        int[]c={9,9};
        assertArrayEquals(c,Auxiliar.ajusteDaCoordenada("j",10));
    }
    
    @Test
    public void E9ResultaEm84()
    {
        String eixoHorizontal="e";
        int eixoVertical=9;
        int[]c={8,4};
        assertArrayEquals(c,Auxiliar.ajusteDaCoordenada("e",9));
    }
}





