import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteDeValidacao {

    @Test
    public void exc3(){
        Robo robo = new Robo(16,0,0, 'L');
        Robo robo1 = new Robo(49, 3,3,'O');

        assertEquals("2 2 N", robo.exploracao("MEMDMEM"));
        assertEquals("4 1 L", robo.exploracao("DMMDME"));
        assertEquals("3 3 S", robo.exploracao("EMMDDDME"));
        assertEquals("0 0 O", robo.exploracao("MMMMMMDMMMMM"));


        assertEquals("5 2 O", robo1.exploracao("EMEMMDD"));
        assertEquals("7 3 S", robo1.exploracao("DMDMMMMMMMD"));
        assertEquals("4 0 N", robo1.exploracao("MMMMMMDMMMD"));
        assertEquals("5 7 L", robo1.exploracao("MMMMMMMMDM"));
    }
}
