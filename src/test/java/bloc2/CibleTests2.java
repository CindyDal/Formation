package bloc2;

import bloc2.bloc2.Cible;
import bloc2.bloc2.IRapporteur;
import bloc2.bloc2.Rapporteur;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.mock;

public class CibleTests2 {

    private Cible target;

    @Test
    public void givenAmountEqualsToThousand_whenPreVerifier_thenAmountIsVerified()
    {
        //given
        IRapporteur rapporteur = mock(IRapporteur.class);
        target = new Cible(rapporteur);

        //when
        boolean actual = target.preVerifier(1000);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void givenAmountLowerThanThousand_whenPreVerifier_thenAmountIsVerified()
    {
        //given
        IRapporteur rapporteur = mock(IRapporteur.class);
        target = new Cible(rapporteur);

        //when
        boolean actual = target.preVerifier(999);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void givenAmountAboveThousand_whenPreVerifier_thenAmountIsNotVerified()
    {
        //given
        IRapporteur rapporteur = mock(IRapporteur.class);
        target = new Cible(rapporteur);

        //when
        boolean actual = target.preVerifier(1001);

        //then
        Assert.assertFalse(actual);
    }


}
