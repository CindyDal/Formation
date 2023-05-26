package bloc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTests {

    private FizzBuzz target;

    @Before
    public void setUp() {
        target = new FizzBuzz();
    }

    @Test
    public void givenMultipleDe3RepondreFizz()
    {
        String actual = target.repondre(3);

        Assert.assertEquals(FizzBuzz.FIZZ,actual);
    }

    @Test
    public void givenMultipleDe5RepondreBuzz()
    {
        String actual = target.repondre(5);

        Assert.assertEquals(FizzBuzz.BUZZ,actual);
    }

    @Test
    public void givenMultipleDe3Et5RepondreFizzBuzz()
    {
        String actual = target.repondre(15);

        Assert.assertEquals(FizzBuzz.FIZZ_BUZZ,actual);
    }

    @Test
    public void givenNestPasUnMultipleDe3Ni5RepondreChiffreDorigine()
    {
        int value = 2;

        String actual = target.repondre(value);

        Assert.assertEquals(String.valueOf(value),actual);
    }
}
