package bloc1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageBonjourTests {

    private MessageBonjour target;

    @Before
    public void setUp()
    {
        target = new MessageBonjour();
    }

    @Test
    public void avant18HeuresDireBonjour() {
        String actual = target.saluer(17);

        Assert.assertEquals("Bonjour",actual);
    }

    @Test
    public void avant7HeuresDireBonsoir()
    {
        String actual = target.saluer(6);
        Assert.assertEquals("Bonsoir",actual);
    }

    @Test
    public void a18HeuresDireBonsoir()
    {
        String actual = target.saluer(18);
        Assert.assertEquals("Bonsoir",actual);
    }

    @Test
    public void apres18HeuresDireBonsoir()
    {
        String actual = target.saluer(19);
        Assert.assertEquals("Bonsoir",actual);
    }
}
